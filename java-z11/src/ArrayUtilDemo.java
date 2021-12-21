import pl.imiajd.adamowicz.ArrayUtil;

import java.time.LocalDate;
import java.util.Arrays;

public class ArrayUtilDemo {

    public static void main(String[] args) {
        Integer[] a = new Integer[2];
        a[0] = 3;
        a[1] = 2;

        LocalDate[] b = new LocalDate[2];
        b[0] = LocalDate.of(2020, 8, 2);
        b[1] = LocalDate.of(2021, 8, 2);
        System.out.println(ArrayUtil.isSorted(a));
        System.out.println(ArrayUtil.isSorted(b));

        System.out.println(ArrayUtil.binSearch(a, 2));
        System.out.println(ArrayUtil.binSearch(b, b[1]));

        ArrayUtil.selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
