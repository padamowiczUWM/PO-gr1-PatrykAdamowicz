package pl.edu.uwm.wmii.adamowiczpatryk.javaz05;

import java.util.ArrayList;
import java.util.Collections;

public class z3 {

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        result.addAll(a);
        result.addAll(b);

        Collections.sort(result);

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list.add(1);
        list.add(4);
        list.add(9);
        list.add(16);

        list2.add(9);
        list2.add(7);
        list2.add(4);
        list2.add(9);
        list2.add(11);

        System.out.println(mergeSorted(list, list2));
    }
}
