package com.javarush.test.level08.lesson11.home04;

import java.io.IOException;
import java.util.*;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array)
    {
        //find minimum here - найти минимум тут
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.size(); i++)
        {


            if (array.get(i) < min)
            {
                min = array.get(i);
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException
    {
        //create and initialize a list here - создать и заполнить список тут
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++)
        {
            int num = sc.nextInt();
            list.add(i, num);
        }
        return list;
    }
}
