import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class z3 {
    public static void main(String[] args) throws IOException {
        String line = "";

        ArrayList<String> as = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        String fileName = in.next();

        FileReader fr = null;
        try {
            fr = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }

        BufferedReader bfr = new BufferedReader(fr);

        while((line = bfr.readLine()) != null){
            as.add(line);
        }

        System.out.println(as);
        Collections.sort(as);
        System.out.println(as);
    }
}
