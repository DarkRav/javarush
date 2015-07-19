package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int []> list = new ArrayList<int[]>();
        int[] a = new int[5];
        array(a);
        list.add(0, a);
        int[] b = new int[2];
        array(b);
        list.add(1, b);
        int[] c = new int[4];
        array(c);
        list.add(2, c);
        int[] d = new int[7];
        array(d);
        list.add(3, d);
        int[] e = new int[0];
        array(e);
        list.add(4, e);
        return list;
    }

    public static int[] array(int[] array)
    {

        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random()*20);
        }
        return array;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array : list)
        {
            for (int x : array)
            {
                System.out.println(x);
            }
        }
    }
}
