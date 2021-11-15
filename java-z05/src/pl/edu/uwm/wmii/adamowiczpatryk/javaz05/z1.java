package pl.edu.uwm.wmii.adamowiczpatryk.javaz05;

import java.util.ArrayList;

public class z1 {

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        a.addAll(b);
        return a;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list2.add(3);
        list2.add(4);

        System.out.println(append(list, list2));
    }
}
