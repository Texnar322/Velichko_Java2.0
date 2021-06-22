package Task3;

public class Candy {
    private String name;
    private int ves;
    private int price;


    public int getPrice() {
        return price;
    }

    public int getVes() {
        return ves;
    }

    public String getName() {
        return name;
    }

    public void setVes(int newVes) {
        ves = newVes;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
