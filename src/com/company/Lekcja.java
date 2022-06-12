package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * W klasie Lekcja zostaja wyrysowane przekonwerowane do string
 * wartosci z plikow tekstowych
 */
public class Lekcja extends JPanel {

    public int wybor_lekcji;
    public static JButton cofnij;

    /**
     * W konstruktorze klasy Lekcja zostaje utworzony i dodany przycisk
     * cofajacy do panelu wyboru lekcji
     */
    Lekcja()
    {
        repaint();
        setLayout(null);
        cofnij = new JButton("Powrót do samouczka");
        cofnij.setBounds(50, 50, 200, 70);
        this.add(cofnij);
    }

    /**
     * Metoda paintComponent() odpowiada za wyrysowanie na panelu informacji zawartej w pliku
     * tekstowym w zalezności od wybranej lekcji oraz tlo panelu
     * Zostaja tez ustawione ich wartosci
     * @param gr Uzycie grafiki
     */
    public void paintComponent(Graphics gr)
    {
        super.paintComponent(gr);
        gr.setFont(new Font("arial", Font.BOLD, 20));
        gr.drawImage(Okno.lekcja, 0, 0,1280,1000, null);

        gr.setColor(Color.WHITE);
        if (wybor_lekcji == 1)
        {
            int y = 300;
            for (String wiersz : Elementy.wczytanie1.split("\n"))
            {
                gr.drawString(wiersz, 250, y += gr.getFontMetrics().getHeight());
            }
        }
        else if (wybor_lekcji == 2)
        {
            int y = 300;
            for (String wiersz : Elementy.wczytanie2.split("\n"))
            {
                gr.drawString(wiersz, 250, y += gr.getFontMetrics().getHeight());
            }
        }
        else if (wybor_lekcji == 3)
        {
            int y = 200;
            for (String wiersz : Elementy.wczytanie3.split("\n"))
            {
                gr.drawString(wiersz, 250, y += gr.getFontMetrics().getHeight());
            }
        }
        gr.setColor(Color.BLACK);
    }
}
