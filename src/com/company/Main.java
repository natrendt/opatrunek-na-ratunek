/**
 * Opatrunek na ratunek
 * Opatrunek na ratunek jest gra edukacyjna polegająca na poszerzaniu swojej wiedzy
 * w zakresie pierwszej pomocy oraz wybieraniu potrzebnych elementow do udzielenia
 * pierwszej pomocy w okreslonych przypadkach.
 *
 * @author Marta Arendt 179990
 * @version 1.0
 */


package com.company;

/**
 * Klasa Main jest klasa, w ktorej tworzy sie nowy obiekt dziedziczący po JFrame.
 * Nowo stworzonym obiektem jest gra.
 */
public class Main {

    public static void main(String[] args)
    {
        Okno gra = new Okno();
        gra.setVisible(true);
    }
}
