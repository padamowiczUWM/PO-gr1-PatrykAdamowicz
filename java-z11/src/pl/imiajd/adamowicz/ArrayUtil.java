package pl.imiajd.adamowicz;

public class ArrayUtil {
    public static <T extends Comparable<? super T>> boolean isSorted(T[] array) {
        if (array == null || array.length < 2) {
            return true;
        }

        T prev = array[0];
        int n = array.length;
        for (int i = 1; i < n; i++) {
            T cur = array[i];
            if (prev.compareTo(cur) > 0) {
                return false;
            }

            prev = cur;
        }
        return true;
    }

    public static <T extends Comparable<? super T>> int binSearch(T[] p, T s) {
        for (int i = 0; i < p.length; i++) {
            if (p[i] == s) {
                return i;
            }
        }

        return -1;
    }

    public static <T extends Comparable<? super T>> void selectionSort(T[] p) {
        int min;
        for(int i = 0; i < p.length - 1; i++) {
            min = i;

            for(int j = i + 1; j < p.length; j++) {
                if(p[min].compareTo(p[j]) > 0) {
                    min=j;
                }
            }

            T swp = p[min];
            p[min] = p[i];
            p[i] = swp;
        }
    }

    public static <T extends Comparable<? super T>> void mergeSort(T[] p, int start, int end) {
        if(end - start < 1) return;

        int middle = (start + end)/2;

        mergeSort(p, start, middle);
        mergeSort(p, middle+1, end);
    }
}
