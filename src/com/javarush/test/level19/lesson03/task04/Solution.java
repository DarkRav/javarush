package com.javarush.test.level19.lesson03.task04;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1978

Подсказка: воспользуйтесь классом Calendar
*/

public class Solution
{
    public static class PersonScannerAdapter implements PersonScanner
    {
        Scanner scanner;

        public PersonScannerAdapter(Scanner sc)
        {
            this.scanner = sc;
        }

        @Override
        public Person read() throws IOException
        {
            String data = scanner.nextLine();
            String[] arr = data.split(" ");
            Calendar calendar = new GregorianCalendar(Integer.parseInt(arr[5]), Integer.parseInt(arr[4]) -1, Integer.parseInt(arr[3]));
            Date date = calendar.getTime();
            Person p = new Person(arr[1], arr[2], arr[0], date);
            return p;
        }

        @Override
        public void close() throws IOException
        {
            this.scanner.close();
        }
    }
}
