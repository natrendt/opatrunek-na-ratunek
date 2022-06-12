package com.company;

/**
 * W klasie Zasady przechowane sa informacje o poprawnych odpowiedziach do gry
 * sprecyzowanych dla kazdego poziomu
 * Wywolanie metody wyborPoziom() umozliwia pobranie informacji o
 * nich z przyporzadkowanych do nich metod
 */
public class Zasady {

    public int zasadypoziom = 0;

    Zasady() {}

    /**
     * Metoda przechowujaca poprawne odpowiedzi do gry dla poziomu 1
     */
    public void zasady1()
    {
        Rysowanie.wybor = new int[] {8,9,10};
    }

    /**
     * Metoda przechowujaca poprawne odpowiedzi do gry dla poziomu 2
     */
    public void zasady2()
    {
        Rysowanie.wybor = new int[] {1,2,3};
    }

    /**
     * Metoda przechowujaca poprawne odpowiedzi do gry dla poziomu 3
     */
    public void zasady3()
    {
        Rysowanie.wybor = new int[] {4,14,16};
    }

    /**
     * Metoda odpowiadajaca za przypasowanie odpowiedniego klucza odpowiedzi
     * przez metody zasad na podstawie przekazanej zmiennej
     */
    public void wyborPoziom()
    {
        Rysowanie.punktyPlus = 0;

        if (zasadypoziom == 1)
        {
            zasady1();
        }
        else if (zasadypoziom == 2)
        {
            zasady2();
        }
        else if (zasadypoziom == 3)
        {
            zasady3();
        }
    }
}
