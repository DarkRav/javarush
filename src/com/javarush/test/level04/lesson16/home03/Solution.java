package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/
import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true) {

            String a = reader.readLine();

            if (a.equals("сумма")) {
                break;
            } else {
                sum = sum + Integer.parseInt(a);
            }

        }
        System.out.println(sum);

    }
}
