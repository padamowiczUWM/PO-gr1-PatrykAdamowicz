package pl.edu.uwm.wmii.adamowiczpatryk.javaz05;

import java.util.ArrayList;

public class z5 {

    public static void reverse(ArrayList<Integer> a) {
        for(int i = 0; i < a.size()/2; i++) {
            int beforeIndex = a.size() - i - 1;
            int before = a.get(beforeIndex);
            a.set(beforeIndex, a.get(i));
            a.set(i, before);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(4);
        list.add(9);
        list.add(16);

        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }
}
