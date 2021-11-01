package pl.edu.uwm.wmii.adamowiczpatryk.laboratorium04;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        BigInteger _count = new BigInteger("1");
        BigInteger _sum = new BigInteger("1");
        BigInteger multiplyValue = new BigInteger("2");
        for(int i = 1; i < n * n; i++) {
            _count = _count.multiply(multiplyValue);

            _sum = _sum.add(_count);
        }

        System.out.println(_sum);
    }
}
