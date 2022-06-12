package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * W klasie WyborPoziom, ktora dziedziczy po JPanel zostaje tworzony panel
 * z przyciskami przekierowujacymi do panelow menu oraz gra.
 * Wybierany zostaje poziom gry.
 */
public class WyborPoziom extends JPanel {

    public static JButton poziom1;
    public static JButton poziom2;
    public static JButton poziom3;
    public static JButton cofnij;
    public static JLabel wyswietlacz;

    /**
     * W konstruktorze klasy WybierzPoziom zostaja stworzone, dodane przyciski oraz label
     * do panelu. Okreslone zostaja ich wartosci.
     */
    WyborPoziom()
    {
        setLayout(null);
        poziom1 = new JButton("Poziom 1");
        poziom2 = new JButton("Poziom 2");
        poziom3 = new JButton("Poziom 3");
        cofnij = new JButton("Powrót do menu");
        wyswietlacz = new JLabel();
        wyswietlacz.setForeground(Color.WHITE);

        poziom1.setBounds(570, 200, 150, 70);
        poziom2.setBounds(570, 280, 150, 70);
        poziom3.setBounds(570, 360, 150, 70);
        cofnij.setBounds(570, 440, 150, 70);
        wyswietlacz.setBounds(410, 590, 500, 30);

        this.add(poziom1);
        this.add(poziom2);
        this.add(poziom3);
        this.add(cofnij);
        this.add(wyswietlacz);
    }

    /**
     * Metoda paintComponent() odpowiada za wyrysowanie tla na panelu
     * @param gr Uzycie grafiki
     */
    public void paintComponent(Graphics gr)
    {
        super.paintComponent(gr);
        gr.drawImage(Okno.poziomW, 0, 0,1280,1000, null);
    }
}
