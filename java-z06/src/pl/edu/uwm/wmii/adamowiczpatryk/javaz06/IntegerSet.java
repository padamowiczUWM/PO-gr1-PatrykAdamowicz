package pl.edu.uwm.wmii.adamowiczpatryk.javaz06;

public class IntegerSet {
    public boolean[] zbior = new boolean[101];

    public IntegerSet() {
    }

    public static IntegerSet union(IntegerSet zbior1, IntegerSet zbior2) {
        IntegerSet is = new IntegerSet();
        for (int i = 0; i < zbior1.zbior.length; i++) {
            if (zbior1.zbior[i] || zbior2.zbior[i]) {
                is.insertElement(i);
            }
        }

        return is;
    }

    public static IntegerSet intersection(IntegerSet zbior1, IntegerSet zbior2) {
        IntegerSet is = new IntegerSet();
        for (int i = 0; i < zbior1.zbior.length; i++) {
            if (zbior1.zbior[i] && zbior2.zbior[i]) {
                is.insertElement(i);
            }
        }

        return is;
    }

    public void insertElement(int k) {
        this.zbior[k] = true;
    }

    public void deleteElement(int k) {
        this.zbior[k] = false;
    }

    public String toString() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < this.zbior.length; i++) {
            if (this.zbior[i]) {
                str.append(i).append(" ");
            }
        }

        return str.toString();
    }

    public boolean equals(IntegerSet zbior2) {
        for (int i = 0; i < this.zbior.length; i++) {
            if (this.zbior[i] != zbior2.zbior[i]) {
                return false;
            }
        }

        return true;
    }
}
