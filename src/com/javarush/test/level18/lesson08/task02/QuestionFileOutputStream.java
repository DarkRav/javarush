package com.javarush.test.level18.lesson08.task02;

import java.io.*;
import java.util.Scanner;

/* Расширяем AmigoOutputStream
Используя шаблон проектирования Wrapper (Decorator) расширьте функциональность AmigoOutputStream
В классе QuestionFileOutputStream при вызове метода close() должна быть реализована следующая функциональность:
1. Вывести в консоль фразу [Вы действительно хотите закрыть поток? Д/Н]
2. Считайте строку
3. Если считанная строка равна [Д], то закрыть поток
4. Если считанная строка не равна [Д], то не закрывать поток
*/

public class QuestionFileOutputStream implements AmigoOutputStream
{
    private AmigoOutputStream amigoOutputStream;

    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream)
    {
        this.amigoOutputStream = amigoOutputStream;
    }

    @Override
    public void flush() throws IOException
    {
        amigoOutputStream.flush();
    }

    @Override
    public void write(int b) throws IOException
    {
        amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException
    {
        amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException
    {
        amigoOutputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException
    {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.equals("Д"))
        {
            amigoOutputStream.close();
        }
    }
}

