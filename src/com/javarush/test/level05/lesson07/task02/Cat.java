package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{

    String name;
    String color;
    String adr;
    int weigth;
    int age;

    public void ini(String name){
        this.name=name;
    }
    public void ini(String name, int weigth, int age){
        this.name=name;
        this.weigth=weigth;
        this.age=age;
    }
    public void ini(String name, int age){
        this.name=name;

        this.age=age;
        weigth=5;
    }
    public  void ini(int weigth, String color){
        this.weigth=weigth;
        this.color=color;
        this.name = null;
        this.adr = null;
        int age = 5;
    }
    //вес цвет адрес
    public void ini(int weigth, String color, String adr){
        this.weigth=weigth;
        this.color=color;

    }
}
