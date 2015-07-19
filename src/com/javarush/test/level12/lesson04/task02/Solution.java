package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Integer i = 7;
        print(i);
        int in = 5;
        print(in);
    }

    public static int print(int a)
    {
        return a;
    }

    public static Integer print(Integer a)
    {
        return a;
    }
    //Напишите тут ваши методы
}
