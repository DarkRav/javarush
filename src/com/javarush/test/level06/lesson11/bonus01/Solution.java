package com.javarush.test.level06.lesson11.bonus01;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде «Max is 25»
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution
{
    public static int max;
    public static void main(String[] args) throws IOException
    {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        max  = a > b ? a : b;

        System.out.println("Max is "+max );
    }

}
