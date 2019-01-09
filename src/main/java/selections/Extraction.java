package selections;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Extraction {
//    public static <E> E[] getAsArrayV1(List<E> le) {
////        E[] result = new E[le.size()];  // Fancy name: "non-reifiable type"
//
//        // Heap pollution! Array of object accepts stuff that array of E should reject
//        E[] result = (E[])new Object[le.size()];
//
//        for (int i = 0; i < le.size(); i++) {
//            result[i] = le.get(i);
//        }
//        return result;
//    }

    public static <E> E[] getAsArray(List<E> le, Class<?> type) {
        E[] result = (E[])Array.newInstance(type, le.size());

        for (int i = 0; i < le.size(); i++) {
            result[i] = le.get(i);
        }
        return result;
    }

    // potential heap pollution
    // If you're sure your code doesn't "leak" Object[] or other sin,
    // can use @SafeVarargs annotation
    public static <E> void doStuff(E ... eVals) {

    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Fred", "Jim", "Sheila");

        String[] sa = getAsArray(names, String.class);
        System.out.println("type of sa is " + sa.getClass().getName());

        List<LocalDate> lld = Arrays.asList();
        System.out.println("Type of LocalDate array is " + getAsArray(lld, LocalDate.class).getClass().getName());
    }
}
