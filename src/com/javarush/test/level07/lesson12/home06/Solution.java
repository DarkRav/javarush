package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось:
 Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human gdad1 = new Human("Федор", true, 65);
        Human gdad2 = new Human("Савелий", true, 65);
        Human gmot1 = new Human("Алевтина", false, 68);
        Human gmot2 = new Human("Марфа", false, 72);
        Human father = new Human("Егор", true, 41, gdad1, gmot1);
        Human mother = new Human("Римма", false, 33, gdad2, gmot2);
        Human ch1 = new Human("Матвей", true, 9, father, mother);
        Human ch2 = new Human("Оксана", false, 8, father, mother);
        Human ch3 = new Human("Марина", false, 6, father, mother);

// Как и для их вывода. Индикод.
        while (true)
        {
            System.out.println(gdad1);
            System.out.println(gdad2);
            System.out.println(gmot1);
            System.out.println(gmot2);
            System.out.println(father);
            System.out.println(mother);
            System.out.println(ch1);
            System.out.println(ch2);
            System.out.println(ch3);
            break;
        }
    }

    public static class Human
    {
        //Написать тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human (String name, boolean sex, int age, Human father, Human mother ){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            father = null;
            mother = null;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}