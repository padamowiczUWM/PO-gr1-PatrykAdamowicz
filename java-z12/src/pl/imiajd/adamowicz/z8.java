package pl.imiajd.adamowicz;

import java.util.ArrayList;

public class z8 {
    public static <E> void print(Iterable<E> iterable) {
        for (E e : iterable) {
            System.out.print(e + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("test");
        list.add("test2");
        list.add("test3");
        print(list);

        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list2.add(5);
        list2.add(3);
        list2.add(2);
        print(list2);
    }
}
