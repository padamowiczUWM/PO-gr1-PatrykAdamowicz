package pl.edu.uwm.wmii.adamowiczpatryk.laboratorium04;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj kapitał początkowy: ");
        BigDecimal kap_pocz = in.nextBigDecimal();
        System.out.println("Podaj stopę procentową: ");
        BigDecimal stop_proc = in.nextBigDecimal();
        System.out.println("Podaj okres w latach: ");
        int lata = in.nextInt();

        BigDecimal result = kap_pocz.multiply(new BigDecimal("1").add(stop_proc.divide(new BigDecimal("100"))).pow(lata));
        System.out.format("Wielkość kapitału: %.02f", result);
    }
}
