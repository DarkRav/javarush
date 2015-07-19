package com.javarush.test.level09.lesson11.home04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        SimpleDateFormat formater = new SimpleDateFormat("MM/d/yyyy", Locale.US);
        Date first = formater.parse(date);

        SimpleDateFormat formater2 = new SimpleDateFormat("MMM d, yyyy", Locale.US);

        String second = formater2.format(first).toUpperCase();

        System.out.println(second);
    }
}
