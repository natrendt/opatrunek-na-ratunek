package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * W klasie Menu dziedziczacej po JPanel wyswietla się panel,
 * w ktorym umieszczone sa przyciski (JButton), ktore odpowiadaja za:
 *      przycisk "graj" odpowiada za przejscie do panelu z wyborem poziomu
 *      przycisk "samouczek" odpowiada za przejscie do panelu z lekcjami
 *      przycisk "jakGrac" przelacza uzytkownika do panelu z informacja jak korzystac z gry
 *      przycisk "wyjscie" zamyka gre
 */
public class Menu extends JPanel {

    public static JButton graj;
    public static JButton samouczek;
    public static JButton jakGrac;
    public static JButton wyjscie;

    /**
     * W konstruktorze klasy Menu zostaje ustawiony rozklad przyciskow w panelu
     * oraz dodanie ich do niego.
     */
    Menu()
    {
        setLayout(null);
        graj = new JButton("Graj!");
        samouczek = new JButton("Samouczek");
        jakGrac = new JButton("Jak grać?");
        wyjscie = new JButton("Wyjście :(");

        graj.setBounds(570, 480, 150, 70);
        samouczek.setBounds(570, 560, 150, 70);
        jakGrac.setBounds(570,640,150,70);
        wyjscie.setBounds(570, 720, 150, 70);

        this.add(graj);
        this.add(samouczek);
        this.add(jakGrac);
        this.add(wyjscie);
    }

    /**
     * Metoda paintComponent() odpowiada za wyrysowanie wczytanego obrazu w zmiennej
     * main w klasie Okno, obraz ten jest tlem dla menu gry.
     * @param gr Używanie grafiki
     */
    public void paintComponent(Graphics gr)
    {
        super.paintComponent(gr);
        gr.drawImage(Okno.main, 0, 0,1280,1000, null);
    }
}


