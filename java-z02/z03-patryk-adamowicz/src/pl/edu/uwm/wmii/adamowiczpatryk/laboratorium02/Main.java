package pl.edu.uwm.wmii.adamowiczpatryk.laboratorium02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Napisz program, który wczyta trzy liczby całkowite m, n, k (każda z przedziału [1; 10]), po
        // czym wygeneruje dwie macierze: macierz a o rozmiarach m×n oraz macierz b o rozmiarach
        // n×k. Następnie wypisze obie macierze na ekran, obliczy iloczyn macierzy a i b w macierzy
        // c oraz wypisze macierz c na ekran.
        Scanner in = new Scanner(System.in);

        System.out.println("Wpisz ilość liczb: ");
        int m = in.nextInt();
        int n = in.nextInt();
        int k = in.nextInt();


        int macierz_1[][] = new int[m][n];
        int macierz_2[][] = new int[n][k];

        Random r = new Random();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int rand = r.nextInt(10);
                macierz_1[i][j] = rand;
            }
        }

        System.out.println(Arrays.deepToString(macierz_1));
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < k; j++) {
                int rand = r.nextInt(10);
                macierz_2[i][j] = rand;
            }
        }
        System.out.println(Arrays.deepToString(macierz_2));

        int macierz_3[][] = new int[m][n];
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                macierz_3[i][j] = 0;
                for (int l = 0; l < k; l++) {
                    macierz_3[i][j] += macierz_1[i][l] * macierz_2[l][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(macierz_3));
    }
}
