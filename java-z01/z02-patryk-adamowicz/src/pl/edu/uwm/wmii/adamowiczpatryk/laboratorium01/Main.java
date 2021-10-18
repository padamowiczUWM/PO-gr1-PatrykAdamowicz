package pl.edu.uwm.wmii.adamowiczpatryk.laboratorium01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

//        Zadanie 1

//        int a = 0,
//                b = 0,
//                c = 0,
//                d = 0,
//                e = 0,
//                f = 0,
//                g = 0,
//                h = 0;
//
//        int table[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            int x = in.nextInt();
//
//            table[i] = x;
//        }
//
//        for(int i = 0; i < n; i++) {
//            if(!(table[i] % 2 == 0)) {
//                a++;
//            }
//
//            if(table[i] % 3 == 0 && !(table[i] % 5 == 0)) {
//                b++;
//            }
//
//            if(Math.sqrt(table[i]) % 2 == 0) {
//                c++;
//            }
//
//            if((i+1) % 2 != 0 && table[i] % 2 == 0) {
//                f++;
//            }
//
//            if(!(table[i] % 2 == 0) && table[i] >= 0) {
//                g++;
//            }
//
//            if(Math.abs(n) < Math.pow(n, 2)) {
//                h++;
//            }
//        }
//
//        for(int i = 1; i < n - 1; i++) {
//            if(table[i] < (table[i - 1] + table[i + 1])/2) {
//                d++;
//            }
//        }
//
//        for(int i = 1; i < n; i++) {
//            int silnia = 1;
//            for (int j = 1; j <= n; j++) {
//                silnia *= j;
//            }
//
//            if(Math.pow(2, table[i]) < table[i] && table[i] < silnia) {
//                e++;
//            }
//        }
//
//        System.out.println("a) " + a);
//        System.out.println("b) " + b);
//        System.out.println("c) " + c);
//        System.out.println("d) " + d);
//        System.out.println("e) " + e);
//        System.out.println("f) " + f);
//        System.out.println("g) " + g);
//        System.out.println("h) " + h);


//        Zadanie 2

//        int suma = 0;
//        for(int i = 0; i < n; i++) {
//            int x = in.nextInt();
//
//            if(x > 0) {
//                suma += x * 2;
//            }
//        }
//        System.out.println("Podwojona suma: " + suma);

//      Zadanie 3

//        int dodatnie = 0, ujemne = 0, zera = 0;
//        for (int i = 0; i < n; i++) {
//            int x = in.nextInt();
//
//            if (x > 0) {
//                dodatnie++;
//            } else if (x < 0) {
//                ujemne++;
//            } else {
//                zera++;
//            }
//        }
//        System.out.println("Dodatnie: " + dodatnie);
//        System.out.println("Ujemne: " + ujemne);
//        System.out.println("Zera: " + zera);


//        Zadanie 4

//        int najmniejsza = 0, najwieksza = 0;
//        for (int i = 0; i < n; i++) {
//            int x = in.nextInt();
//
//            if(i == 0) {
//                najmniejsza = x;
//                najwieksza = x;
//            }
//
//            if(najmniejsza > x) {
//                najmniejsza = x;
//            }
//
//            if(najwieksza < x) {
//                najwieksza = x;
//            }
//        }
//        System.out.println("Najmniejsza: " + najmniejsza);
//        System.out.println("Najwieksza: " + najwieksza);

//        Zadanie 5

        int pary = 0;
        int previous = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();

            if(i == 0) {
                previous = x;
                continue;
            }

            if(previous > 0 && x > 0) {
                System.out.println(previous + " " + x);
                pary++;
            }

            previous = x;

        }
        System.out.println("Ilość: " + pary);
    }
}
