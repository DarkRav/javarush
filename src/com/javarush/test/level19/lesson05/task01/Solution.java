package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in, "cp1251");
        String n1 = scanner.nextLine();
        String n2 = scanner.nextLine();
        FileInputStream in = new FileInputStream(n1);
        FileOutputStream out = new FileOutputStream(n2);

        for (int i = 1; in.available() > 0; i++)
        {
            if (i % 2 == 0)
            {
                out.write(in.read());
            } else
            {
                in.read();
            }
        }
    }
}
