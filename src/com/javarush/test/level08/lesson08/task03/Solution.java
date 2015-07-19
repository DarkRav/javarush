package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        {
            map.put("Петров","Ваня");
            map.put("Сидоров","Петя");
            map.put("Вайнтпуб","Георгий");
            map.put("Полов","Доктор");
            map.put("Петро","Алексей");
            map.put("Пушкин","Алексей");
            map.put("Пет","Алексей");
            map.put("Петрв","Алексей");
            map.put("Пукин","Алексей");
            map.put("Пт","Алексей");
        }
        return (HashMap<String, String>) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int countn = 0;
        name = "Иван";

        for( Map.Entry<String, String> x : map.entrySet())
        {
            String s = x.getValue();

            if (name.equals(s))
            {
                countn++;
            }
        }
        return countn;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int countf = 0;
        familiya = "Иван";
        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, String> x = itr.next();
            String s = x.getKey();

            if (s.equals(familiya))
            {
                countf++;
            }
        }
        return countf;
    }
}
