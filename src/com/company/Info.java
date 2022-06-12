package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Klasa Info pelni role panela wyswietlajacego grafike z informacja o grze
 */
public class Info extends JPanel {

    public static JButton cofnij;

    /**
     * W konstruktorze zostaje dodany JButton cofajacy do panelu menu
     */
    Info()
    {
        setLayout(null);
        cofnij = new JButton("Powrót do menu");
        cofnij.setBounds(50, 50, 200, 70);
        this.add(cofnij);
    }

    /**
     * Metoda paintComponent() odpowiada za wyrysowanie tła na panelu
     * @param gr Użycie grafiki
     */
    public void paintComponent(Graphics gr)
    {
        super.paintComponent(gr);
        gr.drawImage(Okno.info, 0, 0,1280,1000, null);
    }
}
