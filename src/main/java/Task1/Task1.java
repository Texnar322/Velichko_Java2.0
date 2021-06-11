package Task1;

import java.io.*;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException
    {
        System.out.println("Выбрать задание: 1 - выполнение калькулятора, 2 - поиск макс. слова в масиве");
        Scanner scanner = new  Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1)
        {
            calculator();
        }
        else if (choice == 2)
        {
            massivecount();
        }
    }
    public static void calculator()
    {
        Scanner scannercal = new  Scanner(System.in);
        System.out.println("Выберите тип операции: -, +, *, /");
        String sym = scannercal.nextLine();
        System.out.println("Введите первое число");
        double x = scannercal.nextDouble();
        System.out.println("Введите второе число");
        double y = scannercal.nextDouble();
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
    public static void massivecount () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scannermas = new  Scanner(System.in);
        System.out.println("Введите размер одномерного массива: ");
        int arr = scannermas.nextInt();
        String[] words  = new String[arr];
        System.out.println("Введите слова: ");
        int max = -1;
        for (int i = 0; i < words.length; i++)
        {
            words[i] = reader.readLine();
            if (words[i].length() > max) max = words[i].length();
        }
        System.out.println("Самые длинная строки:");
        for (String string : words)
        {
            if (string.length() == max) {
                System.out.println(string);
            }
        }
    }
}
