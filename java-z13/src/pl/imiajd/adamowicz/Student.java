package pl.imiajd.adamowicz;

public class Student implements Comparable<Student> {
    private static int count = 0;
    private String imie;
    private String nazwisko;
    private Integer id;

    public Student(String imie, String nazwisko) {
        this.id = ++count;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Integer getId() {
        return this.id;
    }

    public String toString() {
        return this.id +": "+ this.imie + " " + this.nazwisko;
    }

    @Override
    public int compareTo(Student o) {
        if(this.nazwisko.compareTo(o.nazwisko) > 0) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
