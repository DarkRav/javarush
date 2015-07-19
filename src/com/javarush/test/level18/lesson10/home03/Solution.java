package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать содержимое третьего файла
Закрыть потоки
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{

    public static BufferedWriter reader1;


    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        reader1 = new BufferedWriter(new FileWriter(s1));
        BufferedReader reader2 = new BufferedReader(new FileReader(s2));
        BufferedReader reader3 = new BufferedReader(new FileReader(s3));

        write(reader2);
        write(reader3);

        sc.close();
        reader1.close();
        reader2.close();
        reader3.close();
    }

    public static void write(BufferedReader reader) throws IOException
    {
        while (reader.ready())
        {
            reader1.write(reader.read());
        }
    }
}
