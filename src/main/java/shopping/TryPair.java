package shopping;

import java.time.LocalDate;

public class TryPair {
    public static void main(String[] args) {
        Pair<String> ps = new Pair<>("Hello", "world");

        String s = ps.getLeft();
        ps.setRight("monde");
        System.out.println(ps);
        System.out.println("> " + s);
    }
}
