package Task3;

public class Task3
{
    //1. Создать несколько объектов с параметрами т.е переменными вес цена  название уник параметр типо цвет
    public static void main(String[] args)
    {
        Candy candy = new Candy();
        candy.displayInfo();
        Jellybean jellybean = new Jellybean();
        jellybean.displayInfo();
        Chocolate chocolate = new Chocolate();
        chocolate.displayInfo();
    }
}

class Candy {
        String ves = "2000грамм.";
        void displayInfo()
        {
            System.out.println(ves);
        }
}
class Jellybean {
    String ves = "2000грамм.";
    void displayInfo()
    {
        System.out.println(ves);
    }
}
class Chocolate {
    String ves = "2000грамм.";
    void displayInfo()
    {
        System.out.println(ves);
    }
}