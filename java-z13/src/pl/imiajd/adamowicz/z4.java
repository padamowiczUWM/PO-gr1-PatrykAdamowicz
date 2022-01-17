package pl.imiajd.adamowicz;

import java.util.*;

public class z4 {

    public static void main(String[] args) {
        Map<Integer, HashSet<String>> words = new HashMap<Integer, HashSet<String>>();

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String word = in.next();
            HashSet<String> h_word = new HashSet<>();
            h_word.add(word);
            words.put(word.hashCode(), h_word);
        }

        System.out.println(". . .");
        System.out.println(words.size() + " unikalnych słów.");
    }
}
