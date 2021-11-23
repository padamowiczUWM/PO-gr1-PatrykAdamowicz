package pl.edu.uwm.wmii.adamowiczpatryk.javaz06;

public class z2 {

    public static void main(String[] args) {
        IntegerSet i1 = new IntegerSet();
        i1.insertElement(5);
        i1.insertElement(15);
        System.out.println(i1.toString());
        i1.deleteElement(15);
        System.out.println(i1.toString());
        IntegerSet i2 = new IntegerSet();
        i2.insertElement(5);
        i2.insertElement(15);
        System.out.println(IntegerSet.union(i1, i2));
        System.out.println(i1.equals(i1));
    }
}
