import java.time.LocalTime;
import java.util.ArrayList;

public class Z2 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(3);
        integers.add(1);
        wypiszCoDrugi(integers);

        ArrayList<String> string = new ArrayList<>();
        string.add("abc");
        string.add("bca");
        string.add("cda");
        wypiszCoDrugi(string);
    }

    public static <E> void wypiszCoDrugi(Iterable<E> inters) {
        int i = 0;
        for(E e: inters) {
            if(i%2 == 0) {
                System.out.print(e);
                System.out.print(", ");
            }

            i++;
        }

        System.out.println();
    }
}
