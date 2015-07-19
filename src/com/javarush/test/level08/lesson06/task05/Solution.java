package com.javarush.test.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
*/

public class Solution
{
    public static List getListForGet()
    {
        ArrayList arrayList = new ArrayList();


        return arrayList;
    }

    public static List getListForSet()
    {
        ArrayList arrayList = new ArrayList();
        return arrayList;

    }

    public static List getListForAddOrInsert()
    {
        LinkedList linkedList = new LinkedList();
        return linkedList;
    }

    public static List getListForRemove()
    {
        LinkedList linkedList = new LinkedList();
        return linkedList;
    }
}
