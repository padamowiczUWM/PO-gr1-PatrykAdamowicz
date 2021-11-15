package pl.edu.uwm.wmii.adamowiczpatryk.javaz05;

import java.util.ArrayList;

public class z2 {

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int size = a.size();

        if(size < b.size()) {
            size = b.size();
        }

        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i < size; i++) {
            if(a.size() - 1 >= i) {
                result.add(a.get(i));
            }

            if(b.size() - 1 >= i) {
                result.add(b.get(i));
            }
        }

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

        System.out.println(merge(list, list2));
    }
}
