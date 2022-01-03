package pl.imiajd.adamowicz;

import java.util.Scanner;
import java.util.Stack;

public class z6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Stack<Integer> stos = new Stack<>();

        while(num > 0) {
            stos.push( num % 10 );
            num = num / 10;
        }

        while (!stos.isEmpty()) {
            System.out.println(stos.pop());
        }
    }
}
