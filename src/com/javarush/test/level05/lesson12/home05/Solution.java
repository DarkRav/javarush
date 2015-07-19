package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
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
