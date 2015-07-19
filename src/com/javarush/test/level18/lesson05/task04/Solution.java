package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки ввода-вывода
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String in = reader.readLine();
        String out = reader.readLine();

        FileInputStream streamIn = new FileInputStream(in);
        FileOutputStream streamOut = new FileOutputStream(out);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (streamIn.available() > 0)
        {
            list.add(0, streamIn.read());
        }
        for (int i = 0; i < list.size() ; i++)
        {
            streamOut.write(list.get(i));
        }
        streamIn.close();
        streamOut.close();
    }
}
