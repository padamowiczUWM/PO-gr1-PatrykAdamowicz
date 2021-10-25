package pl.edu.uwm.wmii.adamowiczpatryk.laboratorium02;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void generuj (int tab[], int n, int minWartosc, int maxWartosc) {
        for (int i = 0; i < n; i++) {
            Random r = new Random();
            int rand = r.nextInt(maxWartosc - minWartosc) - maxWartosc;
            tab[i] = rand;
        }
    }

    public static int ileNieparzystych (int tab[]) {
        int nieparzyste = 0;
        for (int i = 0; i < tab.length; i++) {
            if (!(tab[i] % 2 == 0)) {
                nieparzyste++;
            }
        }

        return nieparzyste;
    }
    public static int ileParzystych (int tab[]) {
        int parzyste = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                parzyste++;
            }
        }

        return parzyste;
    }

    public static int ileDodatnich (int tab[]) {
        int dodatnie = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                dodatnie++;
            }
        }

        return dodatnie;
    }
    public static int ileUjemnych (int tab[]) {
        int ujemne = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                ujemne++;
            }
        }

        return ujemne;
    }
    public static int ileZerowych (int tab[]) {
        int zerowe = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == 0) {
                zerowe++;
            }
        }

        return zerowe;
    }

    public static int ileMaksymalnych (int tab[]) {
        int najwiekszy = -999;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > najwiekszy) {
                najwiekszy = tab[i];
            }
        }

        return najwiekszy;
    }

    public static int sumaDodatnich (int tab[]) {
        int suma_dodatnich = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                suma_dodatnich += tab[i];
            }
        }

        return suma_dodatnich;
    }

    public static int sumaUjemnych (int tab[]) {
        int suma_ujemnych = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                suma_ujemnych += tab[i];
            }
        }

        return suma_ujemnych;
    }

    public static int dlugoscMaksymalnegoCiaguDodatnich (int tab[]) {
        int dlugosc = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] >= 0) {
                dlugosc++;
            } else {
                dlugosc = 0;
            }
        }

        return dlugosc;
    }

    public static void signum(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] >= 0) {
                tab[i] = 1;
            }
            else {
                tab[i] = -1;
            }

            System.out.format("%d,\n", tab[i]);
        }
    }

    public static void odwrocFragment(int tab[], int lewy, int prawy) {
        for(int i = 0; i < tab.length; i++) {
            System.out.format("%d,\n", tab[i]);
        }

        System.out.println("\n");
        for (int i = lewy - 1; i < lewy + (prawy - lewy)/2; i++) {
            int last = lewy + (prawy - lewy) - (i - lewy);
            int before = tab[last];
            tab[last] = tab[i];
            tab[i] = before;
        }

        for(int i = 0; i < tab.length; i++) {
            System.out.format("%d,\n", tab[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Wpisz ilość liczb: ");
        int n = in.nextInt();

        int tab[] = new int[n];

        generuj(tab, n, -999, 999);
    }
}
