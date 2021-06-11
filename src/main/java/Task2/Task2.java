package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
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
