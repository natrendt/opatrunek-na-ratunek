package com.company;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.stream.Collectors;

/**
 * W klasie Elementy przechowywane sa informacje o obiektach widniejacych w grze
 */
public class Elementy
{
    public BufferedImage img;
    public static BufferedReader bufor1, bufor2, bufor3;
    public static String wczytanie1, wczytanie2, wczytanie3;
    public final static int wymiar = 100;
    public int wspX, wspY, indeks;
    public boolean obrazKlikniety;

    /**
     * W konstruktorze klasy Elementy zostaja zdefiniowane wartosci dla obiektow
     * @param x wartość położenia na osi X
     * @param y wartość położenia na osi Y
     * @param id wartość indeksu obiektu
     * @param klik wartość domyślna kliknięcia obrazu
     * @param obraz przyporządkowanie obrazu do obiektu
     */
    Elementy(int x, int y, int id, boolean klik, BufferedImage obraz)
    {
        this.wspX = x;
        this.wspY = y;
        this.indeks = id;
        this.obrazKlikniety = klik;
        this.img = obraz;
    }

    /**
     * Metoda wczytaj_plik za pomoca BufferedReader wczytuje pliki tekstowe
     * czytnika do zmiennej, zmienia wartosc pliku na wartosc mozliwa do wypisania
     * (string)
     */
    public static void wczytaj_plik()
    {
        try
        {
            File lekcja1 = new File("elementy/lekcje/lekcja1.txt");
            bufor1 = new BufferedReader(new FileReader(lekcja1));
            File lekcja2 = new File("elementy/lekcje/lekcja2.txt");
            bufor2 = new BufferedReader(new FileReader(lekcja2));
            File lekcja3 = new File("elementy/lekcje/lekcja3.txt");
            bufor3 = new BufferedReader(new FileReader(lekcja3));

            wczytanie1 = bufor1.lines().collect(Collectors.joining(System.lineSeparator()));
            wczytanie2 = bufor2.lines().collect(Collectors.joining(System.lineSeparator()));
            wczytanie3 = bufor3.lines().collect(Collectors.joining(System.lineSeparator()));
        }
        catch(Exception ex)
        {
            System.out.println("The text was not loaded.");
            System.out.println(ex.getMessage());
        }
    }
}
