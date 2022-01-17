package pl.imiajd.adamowicz;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class z1 {
    public static class Task {
        public int priority;
        public String title;

        public String toString() {
            return this.title;
        }
    }

    public static void main(String[] args) {
        boolean end = false;

        PriorityQueue<Task> pq = new PriorityQueue<>((x, y) -> y.priority - x.priority);
        do {
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            String[] command = str.split(" ");

            switch (command[0]) {
                case "dodaj":
                    Task t = new Task();
                    t.priority = Integer.parseInt(command[1]);

                    StringBuilder title = new StringBuilder();

                    for(int i = 2; i < command.length; i++) {
                        title.append(command[i]);
                    }

                    t.title = String.join(",", title.toString());

                    pq.add(t);
                    break;
                case "następne":
                    System.out.println(pq.peek());
                    pq.remove(pq.peek());
                    break;
                case "zakończ":
                    end = true;
                    break;
            }
        } while (!end);
    }
}
