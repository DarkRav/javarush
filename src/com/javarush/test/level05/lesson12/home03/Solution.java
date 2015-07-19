package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12/*высота, см , 5 /*длина хвоста, см )
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);

        Cat tom = new Cat("Tom", 18, 13);

        Dog pit = new Dog("Pit", 44, 5);
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

   public static class Cat
   {
       String name;
       int height;
       int tail;

       public Cat(String name, int height, int tail)
       {
           this.name=name;
           this.height=height;
           this.tail=tail;
       }
   }

    public static class Dog
    {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail)
        {
            this.name=name;
            this.height=height;
            this.tail=tail;
        }
    }
}
