package pl.imiajd.adamowicz;

import java.time.LocalTime;
import java.util.ArrayList;

class ArrayUtil {
    public static <T extends Comparable> boolean jestPalindromem(ArrayList<T> tabs) {
        boolean palindrom = true;
        for (int i = 0; i < tabs.size(); i++) {
            if (tabs.get(i).compareTo(tabs.get(tabs.size() - (i + 1))) == -1) {
                palindrom = false;
                break;
            }
        }
        return palindrom;
    }
}


public class Z1 {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(3);
        integers.add(1);
        integers.add(1);
        System.out.println(ArrayUtil.jestPalindromem(integers));

        ArrayList<Integer> integers2 = new ArrayList<>();
        integers2.add(1);
        integers2.add(3);
        integers2.add(1);
        System.out.println(ArrayUtil.jestPalindromem(integers2));


        ArrayList<LocalTime> localTimes = new ArrayList<>();
        localTimes.add(LocalTime.of(18, 30));
        localTimes.add(LocalTime.of(19, 40));
        localTimes.add(LocalTime.of(18, 30));
        System.out.println(ArrayUtil.jestPalindromem(localTimes));

        ArrayList<LocalTime> localTimes2 = new ArrayList<>();
        localTimes2.add(LocalTime.of(18, 30));
        localTimes2.add(LocalTime.of(19, 40));
        localTimes2.add(LocalTime.of(18, 30));
        localTimes2.add(LocalTime.of(18, 30));
        System.out.println(ArrayUtil.jestPalindromem(localTimes2));
    }
}
