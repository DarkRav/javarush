package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
           while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {


        System.out.println();

        for (int i = 0; i < array.length - 1; i++)
        {
            for (int k = i + 1; k < array.length; k++)
            {
                if ((isNumber(array[i]) == false) && (isNumber(array[k]) == false))
                {
                    if (isGreaterThen(array[i], array[k]))
                    {
                        String tmp = array[i];
                        array[i] = array[k];
                        array[k] = tmp;
                    }
                } else
                {
                    if ((isNumber(array[i]) == true) && (isNumber(array[k]) == true))
                    if (Integer.parseInt(array[i]) < Integer.parseInt(array[k]))
                    {
                        String tmp = array[i];
                        array[i] = array[k];
                        array[k] = tmp;

                    }
                }


            }
        }


    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        for (char c : s.toCharArray())
        {
            if (!Character.isDigit(c) && c != '-') return false;
        }
        return true;
    }
}
