package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
…
я 9
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < 32; i++)
        {
            alphabet.add((char) ('а' + i));
        }
        alphabet.add(6, 'ё');

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        ArrayList<String> count = new ArrayList<String>();

        int cnt = 0;

        for (int i = 0; i < 33; i++)
        {
            for (int j = 0; j < list.size(); j++)
            {
                for (int k = 0; k < list.get(j).length(); k++)
                {
                    if (list.get(j).charAt(k) == alphabet.get(i))
                    {
                        cnt++;
                    }
                }

            }
            char ch = alphabet.get(i);
            count.add(ch + " " + cnt);
            cnt = 0;

        }
        for (String text : count)
        {
            System.out.println(text);
        }
    }

}
