package Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*

         */
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Выберите тип операции: -, +, *, /");
        String sym = scanner.nextLine();
        System.out.println("Введите первое число");
        double x = scanner.nextDouble();
        System.out.println("Введите второе число");
        double y = scanner.nextDouble();
        double z = switch(sym)
         {
            case "+" -> x+y;
            case "-" -> x-y;
            case "*" -> x*y;
            case "/" -> x/y;
             default -> throw new IllegalStateException("Unexpected value: " + sym);
         };
        System.out.format("%.4f",z);






    }
}
