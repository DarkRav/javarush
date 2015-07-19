package com.javarush.test.level13.lesson02.task04;

/* Selectable и Updatable
1. Создай класс Screen.
2. Реализуй в нем интерфейсы Selectable с методом onSelect, Updatable с методом refresh.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
    }

    interface Selectable
    {
        void onSelect();
    }

    interface Updatable
    {
        void refresh();
    }

    //напишите тут ваш класс
    public class Screen implements Selectable, Updatable
    {
        public void onSelect()
        {

        }

        public void refresh()
        {

        }
    }
}
