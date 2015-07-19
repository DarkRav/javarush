package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки ввода-вывода
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();


        FileInputStream stream = new FileInputStream(name1);
        FileOutputStream outputStream1 = new FileOutputStream(name2);
        FileOutputStream outputStream2 = new FileOutputStream(name3);

        int size = stream.available();
        int sizeOrigin = stream.available();

        if (size % 2 != 0) { size = (size / 2) + 1; }
        else { size = size / 2; }

        for (int i = 0; i < size; i++)
        {
            outputStream1.write(stream.read());
        }


        for (int i = size; i < sizeOrigin; i++)
        {
            outputStream2.write(stream.read());
        }

        stream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
