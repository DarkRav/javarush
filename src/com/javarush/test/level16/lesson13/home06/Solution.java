package com.javarush.test.level16.lesson13.home06;

/* Создание по образцу
Разберись, как работает программа.
По образу и подобию CountDownRunnable создай нить CountUpRunnable, которая выводит значения в нормальном порядке - от 1 до number
*/

public class Solution
{
    public static int number = 5;

    public static void main(String[] args) throws InterruptedException
    {
        new CountDownRunnable("было");
        new CountUpRunnable("стало");
    }

    //Add your code below - добавьте код ниже
    public static class CountUpRunnable implements Runnable
    {

        private int countIndexUp = 1;
        Thread t;
        public CountUpRunnable(String name) throws InterruptedException
        {
            t = new Thread(this, name);

            t.start();

        }

        @Override
        public void run()
        {
            while (true)
            {
                System.out.println(toString());

                if (countIndexUp == Solution.number) return;
                countIndexUp += 1;
                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {

                }
            }
        }
        public String toString()
        {
            return t.getName() + ": " + countIndexUp;
        }
    }

    public static class CountDownRunnable implements Runnable
    {
        private int countIndexDown = Solution.number;
        private Thread t;

        public CountDownRunnable(String name)
        {
            t = new Thread(this, name);
            t.start();
        }

        public void run()
        {
            try
            {
                while (true)
                {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            }
            catch (InterruptedException e)
            {
            }
        }

        public String toString()
        {
            return t.getName() + ": " + countIndexDown;
        }
    }
}
