package com.javarush.test.level12.lesson04.task05;

/* Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {
        max(4, 6);
        max(4L, 2L);
        max(8.2d, 7.64d);
    }

    public static int max(int a, int b)
    {
        if (a > b)
        {
            return a;
        } else
        {
            return b;
        }
    }

    public static long max(long a, long b)
    {

        if (a > b)
        {
            return a;
        } else
        {
            return b;
        }
    }

    public static double max(double a, double b)
    {
        if (a > b)
        {
            return a;
        } else
        {
            return b;
        }
    }
    //Напишите тут ваши методы
}
