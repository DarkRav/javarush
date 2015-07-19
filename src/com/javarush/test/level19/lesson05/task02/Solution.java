package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть поток ввода.
*/

import java.io.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream in = new FileInputStream(name);

        String string = "";
        char ch;
        while (in.available() > 0)
        {
            ch = (char) in.read();
            string += ch;
        }


        Pattern pattern = Pattern.compile("\\bworld\\b");
        Matcher matcher = pattern.matcher(string);

        int count = 0;
        while (matcher.find())
        {
            count++;
        }

        System.out.println(count);

        in.close();
        reader.close();
    }
}
