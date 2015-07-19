package com.javarush.test.level08.lesson11.home09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
*/

public class Solution
{
    public static void main(String[] args) throws ParseException
    {

        System.out.println(isDateOdd("MAY 1 2013"));


    }

    public static boolean isDateOdd(String date) throws ParseException
    {
        SimpleDateFormat formater = new SimpleDateFormat("MMM d yyyy", Locale.US);
        Date first = formater.parse(date);
        Date second = new Date();
        long distance = second.getTime() - first.getTime();
        int pri = 24 * 60 * 60 * 1000;
        int dateCount = (int) (distance / pri);

        if (dateCount % 2 == 0)
        {
            return true;
        } else
        {
            return false;
        }

    }
}
