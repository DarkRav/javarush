package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
String fname = null;
String name;
    int age;
    String md;
    public void ini(String name){
        this.fname=name;
    }
    public void ini(String name, int age){
        this.fname=name+age;
    }
    public void ini(String name, int age, String md){
        this.fname=name+age+md;
    }
}
