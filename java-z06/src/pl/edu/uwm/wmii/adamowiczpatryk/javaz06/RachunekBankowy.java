package pl.edu.uwm.wmii.adamowiczpatryk.javaz06;

public class RachunekBankowy {
    private static double rocznaStopaProcentowa;
    private double saldo;

    public RachunekBankowy(double saldo) {
        this.saldo = saldo;
    }

    public double obliczMiesieczneOdestki() {
        this.saldo += (this.saldo * RachunekBankowy.rocznaStopaProcentowa) / 12;
        return this.saldo;
    }

    public static void setRocznaStopaProcentowa(double stopaProcentowa) {
        RachunekBankowy.rocznaStopaProcentowa = stopaProcentowa;
    }
}
