package pl.edu.uwm.wmii.adamowiczpatryk.laboratorium04;

import java.lang.StringBuffer;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int countChar(String str, char c) {
        int _count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                _count++;
            }
        }

        return _count;
    }

    private static int countSubStr(String str, String subStr) {
        int _count = 0;
        int last_index = 0;

        while (last_index != -1) {
            last_index = str.indexOf(subStr, last_index);

            if (last_index != -1) {
                _count++;
                last_index += subStr.length();
            }
        }

        return _count;
    }

    private static String middle(String str) {
        StringBuffer sb = new StringBuffer("");
        if (str.length() % 2 == 0) {
            sb.append(str.charAt(str.length() / 2 - 1));
            sb.append(str.charAt(str.length() / 2));
        } else {
            sb.append(str.charAt(str.length() / 2));
        }

        return sb.toString();
    }

    private static String repeat(String str, int n) {
        StringBuffer sb = new StringBuffer("");
        for(int i = 0; i < n; i++) {
            sb.append(str);
        }

        return sb.toString();
    }

    private static int[] where(String str, String subStr) {
        int[] indexes = new int[countSubStr(str, subStr)];
        int last_index = 0;
        int index = 0;

        while (last_index != -1) {
            last_index = str.indexOf(subStr, last_index);

            if (last_index != -1) {
                indexes[index] = last_index;
                last_index += subStr.length();
                index++;
            }
        }

        return indexes;
    }

    private static String change(String str) {
        StringBuffer sb = new StringBuffer("");

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            }
            else {
                sb.append(Character.toUpperCase(c));
            }
        }

        return sb.toString();
    }

    private static String nice(String str, char sep, int count) {
        StringBuffer sb = new StringBuffer("");
        int start = (str.length() % count);

        if(start == 0) {
            start = count;
        }


        for(int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if(i != str.length() - 1 && start - 1 == i) {
                System.out.println((str.length() - (str.length() - i - 1)));
                sb.append(sep);
                start += count;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("");
        System.out.println("Wprowadź stringa:");
        Scanner in = new Scanner(System.in);
        sb.append(in.nextLine());

        System.out.format("a)%d\n", countChar(sb.toString(), 'c'));
        System.out.format("b)%d\n", countSubStr(sb.toString(), "caa"));
        System.out.format("c)%s\n", middle(sb.toString()));
        System.out.format("d)%s\n", repeat(sb.toString(), 3));
        System.out.format("e)%s\n", Arrays.toString(where(sb.toString(), "nwm")));
        System.out.format("f)%s\n", change(sb.toString()));
        System.out.format("g)%s\n", nice(sb.toString(), ',', 3));
        System.out.format("h)%s\n", nice(sb.toString(), ';', 4));
    }
}
