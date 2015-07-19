package com.javarush.test.level07.lesson04.task04;

import java.util.*;
/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
     Scanner sc = new Scanner(System.in);
     int[] arr = new int[10];
        for (int i = 0; i < 10; i++)
        {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < (arr.length/2); i++) {
            int temp = arr[i];
            arr[i] = arr[(arr.length-1) - i];
            arr[(arr.length-1) - i] = temp;
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
