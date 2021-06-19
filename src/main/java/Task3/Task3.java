package Task3;

public class Task3
{
    //1. Создать несколько объектов с параметрами т.е переменными вес цена  название уник параметр типо цвет
    public static void main(String[] args)
    {
            Gift candy = new Gift();
            candy.displayInfo();

    }


}
class Gift {
        String ves = "2000грамм.";
        void displayInfo()
        {
            System.out.println(ves);
        }
}