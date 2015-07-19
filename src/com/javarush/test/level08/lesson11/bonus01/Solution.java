package com.javarush.test.level08.lesson11.bonus01;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Map<String, Integer> map = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 12; i++)
        {
            map.put("January", 1);
            map.put("February", 2);
            map.put("March", 3);
            map.put("April", 4);
            map.put("May", 5);
            map.put("June", 6);
            map.put("July", 7);
            map.put("August", 8);
            map.put("September", 9);
            map.put("October", 10);
            map.put("November", 11);
            map.put("December", 12);
        }
        String month = sc.nextLine();
        for(Map.Entry<String, Integer>  pair : map.entrySet())
        {
            String s = pair.getKey();
            if(s.equals(month))
            {
                System.out.println(month+" is "+pair.getValue()+" month");
            }
        }
    }

}
