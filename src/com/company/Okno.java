package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

/**
 * Klasa Okno tworzy okno aplikacji, wyswiela sie w nim panel, ktory
 * dzieki CardLayout karta przelacza inne karty nalezace do panelu
 */
public class Okno extends JFrame implements ActionListener{

    public static CardLayout karta = new CardLayout();
    public static ArrayList <Elementy> lista = new ArrayList();
    public static BufferedImage img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15,img16,img17, main, info, lekcja, poziomW;
    public static JPanel nadrzedny = new JPanel();

    /**
     * W konstruktorze klasy Okno zostaje dodany panel nadrzedny, przy pomocy ktorego
     * dodane zostana inne subpanele. Tworzone sa w nim obiekty klas, definiowane sa ich
     * parametry. Dodane i ustawione sa parametry okna.
     */
    Okno()
    {
        add(nadrzedny, BorderLayout.CENTER);

        Menu menu = new Menu();
        Samouczek samouczek = new Samouczek();
        Rysowanie rysuj = new Rysowanie();
        Lekcja lekcja = new Lekcja();
        WyborPoziom wyborP = new WyborPoziom();
        Zasady zasady = new Zasady();
        Info informacja = new Info();

        wywolanie();
        obiekty();
        Elementy.wczytaj_plik();
        nadrzedny.setLayout(karta);
        nadrzedny.add(menu, "menu");
        nadrzedny.add(samouczek, "samouczek");
        nadrzedny.add(rysuj, "rysuj");
        nadrzedny.add(lekcja, "lekcja");
        nadrzedny.add(wyborP, "wyborP");
        nadrzedny.add(informacja, "info");

        karta.show(nadrzedny,"menu");

        /**
         * Ponizej dodano metody ActionListener, ktore sa odpowiedzialne za
         * przelaczanie miedzy dobranymi do nich kartami w momencie nacisnięcia
         * odpowiednio przyporzadkowanego do nich przycisku oraz dodanie wartosci
         * i wywolanie metod
         */
        menu.graj.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                karta.show(nadrzedny, "wyborP");
            }
        });
        menu.samouczek.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                karta.show(nadrzedny, "samouczek");
            }
        });
        menu.jakGrac.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                karta.show(nadrzedny, "info");
            }
        });
        menu.wyjscie.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        lekcja.cofnij.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                karta.show(nadrzedny, "samouczek");
            }
        });
        samouczek.lekcja1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                karta.show(nadrzedny,"lekcja");
                lekcja.wybor_lekcji = 1;
            }
        });
        samouczek.lekcja2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                karta.show(nadrzedny,"lekcja");
                lekcja.wybor_lekcji = 2;
            }
        });
        samouczek.lekcja3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                karta.show(nadrzedny,"lekcja");
                lekcja.wybor_lekcji = 3;
            }
        });
        samouczek.cofnij.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                karta.show(nadrzedny, "menu");
            }
        });
        informacja.cofnij.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                karta.show(nadrzedny, "menu");
            }
        });
        wyborP.poziom1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                karta.show(nadrzedny, "rysuj");
                zasady.zasadypoziom = 1;
                zasady.wyborPoziom();
            }
        });
        wyborP.poziom2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                karta.show(nadrzedny, "rysuj");
                zasady.zasadypoziom = 2;
                zasady.wyborPoziom();
            }
        });
        wyborP.poziom3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                karta.show(nadrzedny, "rysuj");
                zasady.zasadypoziom = 3;
                zasady.wyborPoziom();
            }
        });
        wyborP.cofnij.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                karta.show(nadrzedny, "menu");
            }
        });

        setTitle("Opatrunek na ratunek!");
        setSize(1280,1000);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * Metoda actionPerformed jest nieuzywana, dodana w celu poprawnego funkcjonowania
     * ActionListenera
     * @param e
     */
    public void actionPerformed(ActionEvent e) {}

    /**
     * W metodzie obiekty() zostaja wywolane obiekty klasy Elementy, ktore
     * zostaja dodane do listy w celu wyrysowania ich do panelu gry w klasie Rysowanie
     */
    private void obiekty()
    {
        Elementy a = new Elementy(110, 180,1,false,img2);
        Elementy b = new Elementy(110, 360,2,false,img3);
        Elementy c = new Elementy(110, 540,3,false,img4);
        Elementy d = new Elementy(110, 720,4,false,img5);
        Elementy e = new Elementy(430, 180,5,false,img6);
        Elementy f = new Elementy(430, 360,6,false,img7);
        Elementy g = new Elementy(430, 540,7,false,img8);
        Elementy h = new Elementy(430, 720,8,false,img9);
        Elementy i = new Elementy(750, 180,9,false,img10);
        Elementy j = new Elementy(750, 360,10,false,img11);
        Elementy k = new Elementy(750, 540,11,false,img12);
        Elementy l = new Elementy(750, 720,12,false,img13);
        Elementy m = new Elementy(1070, 180,13,false,img14);
        Elementy n = new Elementy(1070, 360,14,false,img15);
        Elementy o = new Elementy(1070, 540,15,false,img16);
        Elementy p = new Elementy(1070, 720,16,false,img17);

        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);
        lista.add(f);
        lista.add(g);
        lista.add(h);
        lista.add(i);
        lista.add(j);
        lista.add(k);
        lista.add(l);
        lista.add(m);
        lista.add(n);
        lista.add(o);
        lista.add(p);
    }

    /**
     * Metoda wywolanie() odpowiada za wczytanie obrazow z pliku do pamięci przy uzyciu
     * metody ImageIO.read() i przyporzadkowywuje je do zmiennych
     */
    public static void wywolanie()
    {
        try
        {
            img1 = ImageIO.read(new File("elementy/1.png"));
            img2 = ImageIO.read(new File("elementy/2.png"));
            img3 = ImageIO.read(new File("elementy/3.png"));
            img4 = ImageIO.read(new File("elementy/4.png"));
            img5 = ImageIO.read(new File("elementy/5.jpg"));
            img6 = ImageIO.read(new File("elementy/6.png"));
            img7 = ImageIO.read(new File("elementy/7.png"));
            img8 = ImageIO.read(new File("elementy/8.png"));
            img9 = ImageIO.read(new File("elementy/9.png"));
            img10 = ImageIO.read(new File("elementy/10.png"));
            img11 = ImageIO.read(new File("elementy/11.png"));
            img12 = ImageIO.read(new File("elementy/12.png"));
            img13 = ImageIO.read(new File("elementy/13.png"));
            img14 = ImageIO.read(new File("elementy/14.png"));
            img15 = ImageIO.read(new File("elementy/15.png"));
            img16 = ImageIO.read(new File("elementy/16.png"));
            img17 = ImageIO.read(new File("elementy/17.png"));
            main = ImageIO.read(new File("elementy/main.png"));
            info = ImageIO.read(new File("elementy/info.png"));
            lekcja = ImageIO.read(new File("elementy/lekcja.png"));
            poziomW = ImageIO.read(new File("elementy/poziomW.png"));
        }
        catch (Exception ex)
        {
            System.out.println("The image was not loaded.");
            System.out.println(ex.getMessage());
        }
    }
}



