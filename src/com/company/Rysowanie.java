package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Klasa Rysowanie odpowiada za malowanie pola gry w panelu oraz wykonywanie operacji
 * na zmiennych pobranych z niego.
 */
public class Rysowanie extends JPanel
{
    public static int wspolrzednaX;
    public static int wspolrzednaY;
    public static int punktyPlus;
    public int licznik = 0;
    public static int wybor[] = new int[3];

    /**
     * W konstruktorze klasy Rysowanie zostaje wykonane wywolanie malowania tla gry
     * przy uzyciu metody repaint(), dodano tez MouseListenera
     * Zawiera sie w nim metoda MouseListener(), ktora przy kazdym zanotowanym
     * kliknieciu myszka pobiera dane klikniecia, ktore sa wykorzystywane w dalszych
     * procesach.
     */
    Rysowanie()
    {
        repaint();
        addMouseListener(new MouseListener() {
            /**
             * Metoda mouseClicked przyjmuje parametr e, ktorego wartosci polozenia
             * zostaja wczytane do zmiennych przy pomocy metod getX() oraz getY()
             * @param e
             */
            public void mouseClicked(MouseEvent e) {
                wspolrzednaX = e.getX();
                wspolrzednaY = e.getY();

                for(Elementy i: Okno.lista)
                {
                    if((i.wspX <= wspolrzednaX) && (i.wspX+Elementy.wymiar >= wspolrzednaX) && (i.wspY <= wspolrzednaY) && (i.wspY+Elementy.wymiar>= wspolrzednaY))
                    {
                        i.wspY += 2000;
                        i.obrazKlikniety = true;
                        licznik++;
                        repaint();
                    }

                    if (licznik >= 3)
                    {
                        koniec_poziomu();
                    }
                }
            }

            /**
             * Metody mousePressed, mouseReleased, mouseEntered oraz mouseExcited
             * rowniez przybierają parametr zdarzenia e
             * Nie sa uzywane, zostaly pozostawione ze wzgledu na zgodnosc z MouseListenerem
             * @param e
             */
            public void mousePressed(MouseEvent e) {}

            public void mouseReleased(MouseEvent e) {}

            public void mouseEntered(MouseEvent e) {}

            public void mouseExited(MouseEvent e) {}
        });
    }

    /**
     * W metodzie paint() zostaje wywolane rysowanie tla panelu gry oraz wyrysowanie
     * wszystkich elementow z listy Elementy
     * Metoda stale maluje pole gry
     * @param g Uzywanie grafiki
     */
    public void paint(Graphics g)
    {
        g.drawImage(Okno.img1, 0, 0,1280,1000, null);

        for(Elementy i: Okno.lista)
        {
            g.drawImage(i.img, i.wspX, i.wspY, Elementy.wymiar, Elementy.wymiar, null);
        }
    }

    /**
     * Metoda koniec_poziomu odpowiada za przenoszenie obrazow wyrysowanych z listy
     * poza pole gry w momencie nacisnięcia na obszar zajmowany przez obraz
     * Odpowiada tez za porownywanie odpowiednich kombinacji odpowiedzi do danego
     * poziomu oraz zliczanie punktow za poziom
     * Nastepnie wywolane zostaje okno wyboru poziomu
     */
    public void koniec_poziomu()
    {
        for(Elementy i: Okno.lista)
        {
            if(i.wspY > 2000)
            {
                i.wspY -= 2000;

                for(int j = 0; j <= wybor.length - 1; j++)
                {
                    if(wybor[j] == i.indeks)
                    {
                        punktyPlus++;
                    }
                }
            }
        }
        licznik = 0;
        WyborPoziom.wyswietlacz.setText("Wynik z poprzedniego poziomu: " + punktyPlus);
        Okno.karta.show(Okno.nadrzedny, "wyborP");
    }
}