package com.javarush.test.level09.lesson02.task05;

/* Метод должен возвращать результат – глубину её стек-трейса
Написать метод, который возвращает результат – глубину его стек трейса – количество методов в нем (количество элементов в списке). Это же число метод должен выводить на экран.
*/

public class Solution
{
    public static int getStackTraceDeep()
    {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        int elementCount = 0;
        for (StackTraceElement element : stackTraceElement)
        {
            elementCount++;

        }
        System.out.println(elementCount);
        return elementCount;

    }
}
