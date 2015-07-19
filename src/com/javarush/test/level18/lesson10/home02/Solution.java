package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран частоту встречания пробела. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
Закрыть потоки
*/


import java.io.FileInputStream;

import java.io.IOException;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException{
        calcTab(args[0]);
    }

    public static void calcTab(String fileName)throws IOException{
        int countTab = 0;
        int countSym = 0;
        FileInputStream in = new FileInputStream(fileName);
        while (in.available() > 0){
            if(in.read() == 32)countTab++;
            countSym++;
        }
        in.close();
        float pRes = (float)countTab/countSym*100;
        System.out.println(String.format(Locale.ENGLISH, "%.2f", pRes));

    }
}
