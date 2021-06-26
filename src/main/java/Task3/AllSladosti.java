package Task3;

public abstract class AllSladosti{
    private String name;
    private int ves;
    private int price;
    public AllSladosti(String name, int ves, int price)
    {
        this.name = name;
        this.ves = ves;
        this.price = price;
    }
        public int getPrice() {
        return price;
    }

        public int getVes() {
        return ves;
    }
        public String getName() {
        return name;
    }

//        public void setVes(int newVes) {
//        ves = newVes;
//    }

//        public void setName(String newName) {
//        name = newName;
//    }

//        public void setPrice(int price) {
//        this.price = price;
//    }
    }

