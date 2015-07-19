package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        //add your code here
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        String crt = url.substring(36, url.length());
        System.out.println(crt);
        for (int i = 0; i < crt.length(); i++)
        {
            if (crt.charAt(i) != '=')
            {
                System.out.print(crt.charAt(i));
            } else if (crt.charAt(i) == '=')
            {
                System.out.print(" ");
                while (crt.charAt(i) != '&')
                {
                    i++;
                }
            }
        }
    }

    public static void alert(double value)
    {
        System.out.println("double " + value);
    }

    public static void alert(String value)
    {
        System.out.println("String " + value);
    }
}
