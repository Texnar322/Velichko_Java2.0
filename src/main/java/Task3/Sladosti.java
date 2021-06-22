package Task3;

public class Sladosti {
    public static void main(String args[]) {
        Candy candy = new Candy();
        candy.setName("Конфеты");
        candy.setVes(1500);
        candy.setPrice(700);
        Chocolate chocolate = new Chocolate();
        chocolate.setName("Шоколад");
        chocolate.setVes(2000);
        chocolate.setPrice(500);
        chocolate.setProcent("95%");
        Jellybean jellybean = new Jellybean();
        jellybean.setName("Мармеладки");
        jellybean.setVes(3000);
        jellybean.setPrice(600);
        jellybean.setColor("Cиний");
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
