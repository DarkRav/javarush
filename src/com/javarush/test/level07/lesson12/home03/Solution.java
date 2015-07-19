package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum=0;
        int  minimum=Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);

       int [] arr = new int[20];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]>maximum){
                maximum=arr[i];
            }
            if(arr[i]<minimum){
                minimum = arr[i];
            }
        }

        System.out.println(maximum+ " "+ minimum);

    }
}
