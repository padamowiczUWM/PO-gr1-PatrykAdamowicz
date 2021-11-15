package pl.edu.uwm.wmii.adamowiczpatryk.javaz05;

import java.util.ArrayList;
import java.util.Collections;

public class z4 {

    public static ArrayList<Integer> reversed(ArrayList<Integer> a) {
        ArrayList<Integer> l = new ArrayList<Integer>();

        for(int i = 0; i < a.size(); i++) {
            l.add(a.get(a.size() - i - 1));
        }

        return l;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(4);
        list.add(9);
        list.add(16);

        System.out.println(reversed(list));
    }
}
