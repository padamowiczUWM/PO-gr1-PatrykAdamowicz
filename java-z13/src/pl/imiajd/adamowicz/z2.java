package pl.imiajd.adamowicz;

import java.util.*;

public class z2 {
    public static void main(String[] args) {
        Map<String, String> studenci = new HashMap<String, String>();
        boolean end = false;

        do {
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            String[] command = str.split(" ");

            switch (command[0]) {
                case "dodaj":
                    studenci.put(command[1], command[2]);
                    break;
                case "usun":
                    studenci.remove(command[1]);
                    break;
                case "zmien":
                    studenci.put(command[1], command[2]);
                    break;
                case "wypisz":
                    List sortedKeys=new ArrayList(studenci.keySet());
                    Collections.sort(sortedKeys);
                    for(var entry : sortedKeys) {
                        System.out.println(entry + ": " + studenci.get(entry));
                    }
                    break;
            }
        } while (!end);
    }
}
