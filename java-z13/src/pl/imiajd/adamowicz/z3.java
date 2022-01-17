package pl.imiajd.adamowicz;

import java.util.*;

public class z3 {

    public static void main(String[] args) {
        Map<Student, String> studenci = new HashMap<Student, String>();
        boolean end = false;

        do {
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            String[] command = str.split(" ");

            switch (command[0]) {
                case "dodaj":
                    studenci.put(new Student(command[1], command[2]), command[3]);
                    break;
                case "usun":
                    for(var student : studenci.keySet()) {
                        if (student.getId() == Integer.parseInt(command[1])) {
                            studenci.remove(student);
                            break;
                        }
                    }
                    break;
                case "zmien":
                    for(var student : studenci.keySet()) {
                        if (student.getId() == Integer.parseInt(command[1])) {
                            studenci.put(student, command[2]);
                            break;
                        }
                    }
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
