package pl.edu.uwm.wmii.adamowiczpatryk.laboratorium04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String line = "";
        System.out.println("Wprowadź nazwe pliku: ");
        Scanner in = new Scanner(System.in);

        String fileName = in.next();

        System.out.println("Wprowadź wyraz: ");

        String word = in.next();

        FileReader fr = null;
        try {
            fr = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }

        BufferedReader bfr = new BufferedReader(fr);

        int _count = 0;
        while((line = bfr.readLine()) != null){
            int last_index = 0;

            while (last_index != -1) {
                last_index = line.indexOf(word, last_index);

                if (last_index != -1) {
                    _count++;
                    last_index += word.length();
                }
            }
        }

        System.out.println(_count);
    }
}
