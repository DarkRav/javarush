package com.javarush.test.level19.lesson05.task05;

/* Пунктуация
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Удалить все знаки пунктуации, вывести во второй файл.
http://ru.wikipedia.org/wiki/%D0%9F%D1%83%D0%BD%D0%BA%D1%82%D1%83%D0%B0%D1%86%D0%B8%D1%8F
Закрыть потоки ввода-вывода.
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in, "cp1251");
        String n1 = scanner.nextLine();
        String n2 = scanner.nextLine();
        FileReader in = new FileReader(n1);
        FileOutputStream out = new FileOutputStream(n2);

        String s = "";
        Character character;
        for (int i = 1; in.ready(); i++)
        {
            character = (char) in.read();
            s += character;

        }
        s = s.replaceAll("\\p{Punct}", "");

        out.write(s.getBytes());
        scanner.close();
        in.close();
        out.close();

    }
}
