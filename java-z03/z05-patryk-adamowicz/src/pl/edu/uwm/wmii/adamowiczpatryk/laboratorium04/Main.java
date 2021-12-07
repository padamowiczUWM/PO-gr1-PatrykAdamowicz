package pl.edu.uwm.wmii.adamowiczpatryk.laboratorium04;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {

        ArrayList<Integer> c = new ArrayList<Integer>(a);

        for(int i = 0; i < b.size(); i++) {
            if(!c.contains(b.get(i))) {
                c.add(b.get(i));
            }
        }

        return c;
    }

    public static String modify(String str) {
        StringBuffer sb = new StringBuffer("");

        if(str.length() % 2 == 0) {
            for(int i = 0; i < str.length(); i++) {
                if (str.length() / 2 == i || str.length() / 2 - 1 == i) {
                    sb.append(Character.toUpperCase(str.charAt(i)));
                } else {
                    sb.append(str.charAt(i));
                }
            }
        }
        else {
            for(int i = str.length() - 1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);

        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(3);
        b.add(4);
        b.add(5);

        System.out.println(modify("mad"));
    }
}
