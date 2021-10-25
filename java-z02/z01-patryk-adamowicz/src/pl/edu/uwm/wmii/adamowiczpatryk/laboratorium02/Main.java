package pl.edu.uwm.wmii.adamowiczpatryk.laboratorium02;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Wpisz ilość liczb: ");
        int n = in.nextInt();

        int tab[] = new int[n];

        for (int i = 0; i < n; i++) {
            Random r = new Random();
            int rand = r.nextInt(999 + 999) - 999;
            tab[i] = rand;
        }

//        // 1.a
//        int parzyste = 0;
//        int nieparzyste = 0;
//        for (int i = 0; i < n; i++) {
//            if (tab[i] % 2 == 0) {
//                parzyste++;
//            } else {
//                nieparzyste++;
//            }
//        }
//
//        System.out.format("Parzyste: %d\nNieparzyste: %d\n", parzyste, nieparzyste);
//        // 1.b
//        int dodatnie = 0;
//        int ujemne = 0;
//        int zerowe = 0;
//        for (int i = 0; i < n; i++) {
//            if (tab[i] > 0) {
//                dodatnie++;
//            } else if (tab[i] < 0) {
//                ujemne++;
//            } else {
//                zerowe++;
//            }
//        }
//
//        System.out.format("Dodatnie: %d\nUjemne: %d\nZerowe: %d\n", dodatnie, ujemne, zerowe);
//
//        // 1.c znajdzie w tablicy element największy oraz obliczy ile razy występuje on w tablicy
//        int ilerazy = 0;
//        int najwiekszy = -999;
//        for (int i = 0; i < n; i++) {
//            if (tab[i] > najwiekszy) {
//                ilerazy = 0;
//                najwiekszy = tab[i];
//            }
//
//            if (tab[i] == najwiekszy) {
//                ilerazy++;
//            }
//        }
//
//        System.out.format("El. najwiekszy: %d\nWystepuje on: %d razy\n", najwiekszy, ilerazy);
//
//        // 1.d obliczy sumę ujemnych elementów tablicy oraz sumę dodatnich elementów tablicy.
//        int suma_ujemnych = 0;
//        int suma_dodatnich = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (tab[i] > 0) {
//                suma_dodatnich += tab[i];
//            } else {
//                suma_ujemnych += tab[i];
//            }
//        }
//
//        System.out.format("Suma dodatnich: %d\nSuma ujemnych: %d\n", suma_dodatnich, suma_ujemnych);
//
//        // 1.e obliczy długość najdłuższego fragmentu tablicy, w którym wszystkie elementy są dodatnie.
//        int najwiekszadlugosc = 0;
//        int dlugosc = 0;
//        for (int i = 0; i < n; i++) {
//            if (tab[i] >= 0) {
//                dlugosc++;
//
//                if(dlugosc > najwiekszadlugosc) {
//                    najwiekszadlugosc = dlugosc;
//                }
//            } else {
//                dlugosc = 0;
//            }
//        }
//
//        System.out.format("Długość najdłuższego fragmentu tablicy: %d\n", najwiekszadlugosc);
//
//        // 1.f każdy dodatni element tablicy zastąpi liczbą 1, a każdy ujemny zastąpi liczbą −1.
//        // Następnie wypisze tak zmodyfikowaną tablicę.
//        System.out.println("Zmodyfikowana tablica:");
//        for (int i = 0; i < n; i++) {
//            if(tab[i] >= 0) {
//                tab[i] = 1;
//            }
//            else {
//                tab[i] = -1;
//            }
//
//            System.out.format("%d,\n", tab[i]);
//        }

        // 1.g wczyta dwie liczby całkowite do zmiennych lewy i prawy (1 ≤ lewy < n, 1 ≤ prawy <
        // n), a następnie odwróci kolejność elementów we fragmencie tablicy wyznaczonym
        // przez wartości tych zmiennych.
        int lewy = in.nextInt() - 1;
        int prawy = in.nextInt() - 1;

        for(int i = 0; i < n; i++) {
            System.out.format("%d,\n", tab[i]);
        }

        System.out.println("\n");
        for (int i = lewy - 1; i < lewy + (prawy - lewy)/2; i++) {
            int last = lewy + (prawy - lewy) - (i - lewy);
            int before = tab[last];
            tab[last] = tab[i];
            tab[i] = before;
        }

        for(int i = 0; i < n; i++) {
            System.out.format("%d,\n", tab[i]);
        }
    }
}
