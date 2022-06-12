package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * W klasie Samouczek zostaje utworzony panel, dzieki ktoremu mozna przejsc
 * do wybranej lekcji
 */
public class Samouczek extends JPanel {

    public static JButton lekcja1;
    public static JButton lekcja2;
    public static JButton lekcja3;
    public static JButton cofnij;

    /**
     * W konstruktorze klasy Samouczek zostaja utworzone oraz dodane
     * przyciski przenoszące do panelu menu oraz lekcja
     * Ustalone są wartosci przyciskow
     * */
    Samouczek()
    {
        setLayout(null);
        lekcja1 = new JButton("Lekcja 1");
        lekcja2 = new JButton("Lekcja 2");
        lekcja3 = new JButton("Lekcja 3");
        cofnij = new JButton("Powrót do menu");

        lekcja1.setBounds(570, 200, 150, 70);
        lekcja2.setBounds(570, 280, 150, 70);
        lekcja3.setBounds(570, 360, 150, 70);
        cofnij.setBounds(570, 440, 150, 70);

        this.add(lekcja1);
        this.add(lekcja2);
        this.add(lekcja3);
        this.add(cofnij);
    }

    /**
     * Metoda paintComponent() odpowiada za wyrysowanie tla na panelu
     * @param gr Uzycie grafiki
     */
    public void paintComponent(Graphics gr)
    {
        super.paintComponent(gr);
        gr.drawImage(Okno.lekcja, 0, 0,1280,1000, null);
    }
}
