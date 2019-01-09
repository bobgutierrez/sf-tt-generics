package shopping;
                         /* extends means "assignment compatible with Sized*/
// Type variables "should" be single upper case letters, but can mask real class names!!!
//public class ClothingPair<E extends Sized, String> extends Pair<E> {

public class ClothingPair<E extends /* SomeObjectBound & */ Sized & Colored> extends Pair<E> {
//    String thing = "Hello"; // FAILS! Not a java.lang.String
//    java.lang.String thing = "Hello";

    public ClothingPair(E left, E right) {
        super(left, right);
    }

    public boolean isMatched() {
        // instanceof??
        return left.getSize() == right.getSize()
                && left.getColor().equals(right.getColor());
    }

    public static <F extends Sized & Colored> boolean match(F left, F right) {
        return left.getSize() == right.getSize()
                && left.getColor().equals(right.getColor());
    }
}
