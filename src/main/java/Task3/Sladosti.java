package Task3;

public class Sladosti {
    public static void main(String args[]) {
        Candy candy = new Candy("Конфеты", 1500, 700, "Драже");
        Chocolate chocolate = new Chocolate("Шоколад", 2000, 500, "95%");
        Jellybean jellybean = new Jellybean("Мармеладки", 3000, 600, "Синий");
        System.out.println("Подарок стоит из: " + candy.getName() + " "+ chocolate.getName() + " "
                + jellybean.getName());
        System.out.println(candy.getName() +" "+ "Цена "+ candy.getPrice() +" рублей "+ "Вес "+ candy.getVes()+" грамм ");
        System.out.println(chocolate.getName()+" "+ "Цена " + chocolate.getPrice() +" рублей "+ "Вес "+ chocolate.getVes()+" грамм "+ "Горкость шоколада "+chocolate.getProcent());
        System.out.println(jellybean.getName()+" "+ "Цена "+ jellybean.getPrice() +" рублей "+ "Вес "+ jellybean.getVes()+" грамм "+ "Цвет "+ jellybean.getColor());
        System.out.println("Общий вес: ");
        System.out.println(candy.getVes() + chocolate.getVes()+ jellybean.getVes());
        System.out.println("Общая цена: ");
        System.out.println(candy.getPrice() + chocolate.getPrice() + jellybean.getPrice());
        //System.out.println(candy.getPrice() + chocolate.getPrice() + jellybean.getPrice());
    }
}
