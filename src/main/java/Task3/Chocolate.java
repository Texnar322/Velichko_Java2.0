package Task3;

public class Chocolate extends AllSladosti{
    private String procent;

    public Chocolate(String name, int ves, int price, String procent) {
        super(name, ves, price);
        this.procent = procent;
    }

    public String getProcent() {
        return procent;
    }
//    public void setProcent(String procent) {
//        this.procent = procent;
//    }

    //1 класс арифметически действия //2 класс parse из стринги по действиям regular  Exception невалидный символ, 0
}
