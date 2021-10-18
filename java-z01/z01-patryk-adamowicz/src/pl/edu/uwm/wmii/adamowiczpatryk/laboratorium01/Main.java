package pl.edu.uwm.wmii.adamowiczpatryk.laboratorium01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        Zadanie 1
//        System.out.println("Wpisz ilość liczb: ");
//        int n = in.nextInt();
//
//        double a = 0,
//                b = 0,
//                c = 0,
//                d = 0,
//                e = 0,
//                f = 0,
//                h = 0,
//                i1 = 0;
//
//        for (int i = 1; i < n + 1; i++) {
//            int x = in.nextInt();
//
//            if(i == 1) {
//                a = x;
//                b = x;
//                c = Math.abs(x);
//                d = Math.sqrt(Math.abs(x));
//                e = Math.abs(x);
//                f = Math.pow(x, 2);
//                h = Math.pow(-1, i + 1) * x;
//                continue;
//            }
//
//            a += x;
//            b *= x;
//            c += Math.abs(x);
//            d += Math.sqrt(Math.abs(x));
//            e *= Math.abs(x);
//            f += Math.pow(x, 2);
//            h += Math.pow(-1, i + 1) * x;
//
//            int silnia = 1;
//            for (int j = 1; j <= n; j++) {
//                silnia *= j;
//            }
//
//            i1 += (Math.pow(-1, i) * x) / silnia;
//        }
//
//        System.out.println("a) " + a);
//        System.out.println("b) " + b);
//        System.out.println("c) " + c);
//        System.out.println("d) " + d);
//        System.out.println("e) " + e);
//        System.out.println("f) " + f);
//        System.out.println("g) " + (a + b));
//        System.out.println("h) " + h);
//        System.out.println("i) " + i1);
//
//    Zadanie 2
        System.out.println("Wpisz ilość liczb: ");
        int n = in.nextInt();

        int table[] = new int[n];
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            table[i] = x;
        }

        for (int i = 1; i < n; i++) {
            System.out.println(table[i]);
        }
        System.out.println(table[0]);

    }
}
