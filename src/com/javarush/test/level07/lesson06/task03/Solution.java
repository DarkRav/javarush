package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.util.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            String s = sc.nextLine();
            list.add(i, s);
        }

        for(int i=0;i<list.size()/2;i++)
        {
            String buf = list.get(i);
            list.remove(i);
            list.add(i,list.get(list.size()-1));
            list.remove(list.size() - 1);
            list.add(list.size()-1,buf);
        }
        for(String i: list){
            System.out.println(i);
        }
    }
}
