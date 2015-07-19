package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть закрыть файл и поток.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)
    {
        //add your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            String fileName = br.readLine();
            FileInputStream fileInputStream = new FileInputStream(fileName);
            while (fileInputStream.available() > 0)
            {
                int data = fileInputStream.read();
                System.out.print((char) data);
            }

            fileInputStream.close();
            br.close();

        }
        catch (IOException e)
        {
            System.out.println("Файла не существует.");
        }
    }
}
