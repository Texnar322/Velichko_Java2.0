package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Arrays;
//import org.apache.commons.lang.ArrayUtils;

public class Task2 {
    static int max = 0;
    public static void main(String[] args) throws IOException
    {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 20) - 10);
            System.out.println(array[i]);
        }
        findMax(array);
        findMin(array);
    }
    public static void findMax(int[] array)
    {
        Arrays.sort(array);// узнать как работает
        max = array[array.length - 1];
        System.out.println("Максимальный элемент" + max);
    }
    public static void findMin(int[] array)
    {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[0]) {
                min = array[i];
            }
        }
        System.out.println("Минимальный  элемент" + min);
    }
}