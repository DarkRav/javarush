package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> children = new ArrayList<Human>();
        children.add(0, new Human("ch1", true, 18));
        children.add(1, new Human("ch2", true, 11));
        children.add(2, new Human("ch3", true, 14));
        Human dad = new Human("Вася", true, 28, children);
        Human mom = new Human("Нина", false, 25, children);
        Human gDadF = new Human("дед Валя", true, 95, dad);
        Human gDadM = new Human("дед Буля", true, 75, mom);
        Human gMomF = new Human("баба Нюра", false, 75, dad);
        Human gMomM = new Human("баба Зина", false, 65, mom);

        while (true)
        {
            System.out.println(gDadF.toStringer());
            System.out.println(gDadM.toStringer());
            System.out.println(gMomF.toStringer());
            System.out.println(gMomM.toStringer());
            System.out.println(dad.toStrin());
            System.out.println(mom.toStrin());
            System.out.println(children.get(0).toStrin());
            System.out.println(children.get(1).toStrin());
            System.out.println(children.get(2).toStrin());
            break;
        }
    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children;
        Human h;

        public Human(String name, Boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        public Human(String name, Boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;

        }

        public Human(String name, Boolean sex, int age, Human h)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.h = h;
        }

        public String toStringer()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.h == null)
            {
                text += ", дети: " + null;
            } else
            {

                text += ", дети: " + this.h.name;

            }


            return text;
        }


        public String toStrin()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.children == null)
            {
                text += ", дети: " + null;
            } else
            {
                int childCount = this.children.size();
                if (childCount > 0)
                {
                    text += ", дети: " + this.children.get(0).name;

                    for (int i = 1; i < childCount; i++)
                    {
                        Human child = this.children.get(i);
                        text += ", " + child.name;
                    }
                }
            }
            return text;
        }
    }

}
