package pl.imiajd.adamowicz;

import java.util.Scanner;

public class z7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] pierwsze = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            pierwsze[i] = i;
        }

        int k;
        int pier_n = (int) Math.floor(Math.sqrt(n));
        for (int i = 2; i <= pier_n; i++) {
            if (pierwsze[i] != 0) {
                k = i + i;
                while (k <= n) {
                    pierwsze[k] = 0;
                    k += i;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (pierwsze[i] != 0) {
                System.out.println(pierwsze[i]);
            }
        }
    }
}
