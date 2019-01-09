package shopping;

public class Glove implements Sized, Colored {
    int size;
    String color;

    public Glove(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Glove{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
