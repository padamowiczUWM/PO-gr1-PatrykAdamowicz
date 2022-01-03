package pl.imiajd.adamowicz;

import java.util.*;

public class z1234 {
    public static <T> void redukuj(LinkedList<T> pracownicy, int n) {
        int j = 0;
        for (int i = 0; i < pracownicy.size(); i++) {
            j++;
            if (j % n == 0) {
                pracownicy.remove(i);
                j = 0;
                i--;
            }
        }
    }

    public static <T> void odwroc(LinkedList<T> lista) {
        Collections.reverse(lista);
    }


    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<String>();
        a.add("masło");
        a.add("chleb");
        a.add("kabanosy");
        a.add("masło");
        a.add("chleb");
        a.add("kabanosy");
        redukuj(a, 3);

        System.out.println(a.toString());

        odwroc(a);
        System.out.println(a.toString());
    }
}
