package selections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Criterion<E> {
    boolean test(E e);
}

class LongStringCriterion implements Criterion<String> {
    @Override
    public boolean test(String s) {
        return s.length() > 4;
    }
}

// lambda: s -> s.length() > 4

public class SelectStrings {
    public static <E> List<E> filter(List<E> list, Criterion<? super E> crit) {
        List<E> output = new ArrayList<>();
        for (E e : list) {
            if (crit.test(e)) {
                output.add(e);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Fred", "Jim", "Sheila");
        System.out.println(ls);

        Criterion<CharSequence> cs = s -> s.length() > 4;

        System.out.println(filter(ls, cs));

        List<CharSequence> lcs = Arrays.asList(new StringBuilder("Fred"), new StringBuilder("Jim"), new StringBuilder("Sheila"));

        Criterion<Object> co = o -> o == "Jim";

        // Function arguments are "contravariant"
        System.out.println(filter(ls, co));
    }
}
