package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Arrays;
//import org.apache.commons.lang.ArrayUtils;

public class Task2 {
    //static int max = 0;
    public static void main(String[] args) throws IOException
    {
        int[] arr = createAndFillRandomArray(20);
        int max_negative = Integer.MIN_VALUE;
        int min_positive = Integer.MAX_VALUE;
        int positive = 0, negative = 0;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] < 0) && (max_negative < arr[i])) {
                max_negative = arr[i];
                negative = i;
            }
            if ((arr[i] >= 0) && (min_positive > arr[i])) {
                min_positive = arr[i];
                positive = i;
            }
        }
        System.out.println("Минимальный  положительный : " + min_positive);
        System.out.println("Максимальный отрицательный: " + max_negative);
        temp = arr[negative];
        arr[negative] = arr[positive];
        arr[positive] = temp;

        System.out.println("\nМассив после замены:");
        System.out.println(Arrays.toString(arr));
    }
    public static int[] createAndFillRandomArray(int n) {
        System.out.println("Массив до замены:");
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = (int) ((Math.random() * 20) - 10);
        }
        System.out.println(Arrays.toString(mas));
        return mas;
    }
}
