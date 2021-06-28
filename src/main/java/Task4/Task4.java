package Task4;

import java.io.*;

public class Task4 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите выражение для вычисления:");
        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String name = bufferedReader.readLine();

        System.out.println(name);
    }
}
