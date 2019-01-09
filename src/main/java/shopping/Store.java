package shopping;

public class Store {
    public static void main(String[] args) {
        Glove g1 = new Glove(6,"Red");
        Glove g2 = new Glove(7, "Red");
        ClothingPair<Glove> pg = new ClothingPair<>(g1, g2);
        System.out.println("Gloves match? " + pg.isMatched());

        ClothingPair<Glove> pg2 = new ClothingPair<>(new Glove(7,"Pink"), new Glove(7, "Red"));
        System.out.println("Gloves match? " + pg2.isMatched());

        System.out.println("Static match says: " + ClothingPair.match(g1, g2));
    }
}
