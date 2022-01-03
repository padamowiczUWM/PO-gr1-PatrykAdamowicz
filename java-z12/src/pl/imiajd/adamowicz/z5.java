package pl.imiajd.adamowicz;

import java.util.Scanner;
import java.util.Stack;

public class z5 {
    public static void main(String[] args) {
        Stack<String> stos = new Stack<>();
        Scanner s = new Scanner(System.in);

        String text = s.nextLine();
        String temp = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                stos.push(temp.toLowerCase());
                temp = "";
            } else {
                temp = temp + text.charAt(i);
            }

            if (text.charAt(i) == '.') {
                stos.push(temp.substring(0, 1).toUpperCase() + temp.substring(1, temp.length() - 1));


                while (!stos.isEmpty()) {
                    temp = stos.peek();
                    System.out.print(temp);

                    if (stos.firstElement().equals(temp)) {
                        System.out.print(". ");
                    } else {
                        System.out.print(' ');
                    }

                    stos.pop();
                    temp = "";
                }
            }
        }
    }
}
