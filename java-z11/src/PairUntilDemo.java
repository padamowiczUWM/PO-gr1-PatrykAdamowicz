import pl.imiajd.adamowicz.Pair;
import pl.imiajd.adamowicz.PairUtil;

public class PairUntilDemo {

    public static void main(String[] args) {
        Pair first = new Pair(1, 2);
        first = PairUtil.swap(first);
        System.out.println(first.getFirst());
    }
}
