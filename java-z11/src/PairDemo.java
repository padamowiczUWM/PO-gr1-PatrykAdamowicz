import pl.imiajd.adamowicz.Pair;
import pl.imiajd.adamowicz.PairUtil;

public class PairDemo {

    public static void main(String[] args) {
        Pair pair = new Pair(1, 2);
        pair.swap();
        System.out.println(pair.getFirst());
    }
}
