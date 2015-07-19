package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/
import java.io.*;
public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader rd = new BufferedReader (new InputStreamReader (System.in));
        int n1 = Integer.parseInt(rd.readLine());
        int n2 = Integer.parseInt(rd.readLine());
        int n3 = Integer.parseInt(rd.readLine());
        if (n1<n2&&n1>n3){
            System.out.print (n1);
        }
        else if (n2>n1&&n2<n3){
            System.out.print (n2);
        }
        else
            System.out.print (n3);
    }
}