package Task3;

public class Jellybean extends AllSladosti{
    private String color;

    public Jellybean(String name, int ves, int price, String color) {
        super(name, ves, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
