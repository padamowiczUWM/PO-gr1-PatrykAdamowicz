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

        System.out.println("Wprowadź znak: ");

        char sign = in.next().charAt(0);

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
            for(int i = 0; i < line.length(); i++) {
                if(line.charAt(i) == sign) {
                    _count++;
                }
            }
        }

        System.out.println(_count);
    }
}
