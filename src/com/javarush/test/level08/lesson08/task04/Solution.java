package com.javarush.test.level08.lesson08.task04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
//    public static void main(String[] args) throws ParseException
//    {
//        HashMap<String, Date> map = createMap();
//        removeAllSummerPeople(map);
//
//    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE      1 1980"));
        map.put("Сталлоне2", new Date("JUNE      1 1980"));
        map.put("Сталлоне3", new Date("AUGUST    1 1980"));
        map.put("Сталлоне4", new Date("SEPTEMBER 1 1980"));
        map.put("Сталлоне5", new Date("JANUARY   1 1980"));
        map.put("Сталлоне6", new Date("JUNE      1 1980"));
        map.put("Сталлоне7", new Date("JUNE      1 1980"));
        map.put("Сталлоне8", new Date("AUGUST    1 1980"));
        map.put("Сталлоне9", new Date("DECEMBER  1 1980"));
        map.put("Сталлоне0", new Date("NOVEMBER  1 1980"));

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) throws ParseException
    {
        HashMap<String, Date> dateHashMap = new HashMap();
        dateHashMap.put("1", new Date("JUNE 1 1980"));
        dateHashMap.put("2", new Date("JULY 1 1980"));
        dateHashMap.put("3", new Date("AUGUST 1 1980"));

        SimpleDateFormat formatter = new SimpleDateFormat("MMMM", Locale.ENGLISH);


        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        int i = 0;
        while (iterator.hasNext())
        {

            Map.Entry<String, Date> pair = iterator.next();

            Date f = pair.getValue();
            String first = formatter.format(f);

            for (Map.Entry<String, Date> j : dateHashMap.entrySet())
            {
                String second = formatter.format(j.getValue());

                if (second.equals(first))
                {
                    iterator.remove();
                }

            }
            i++;
        }
//        for (Map.Entry<String, Date> x : map.entrySet())
//        {
//            String sout = formatter.format(x.getValue());
//            System.out.println(sout);
//        }

    }
}
