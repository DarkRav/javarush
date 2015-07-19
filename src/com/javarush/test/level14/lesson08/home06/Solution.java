package com.javarush.test.level14.lesson08.home06;

/* MovieFactory
Расширение функционала по аналогии, чтение с консоли:
1. Разобраться, что программа умеет делать.
2. Все классы должны быть внутри класса Solution.
3. Добавить классы Cartoon, Triller.
4. Разобраться, как мы получаем объект класса SoapOpera по ключу "soapOpera".
Аналогично получению объекта SoapOpera сделать:
5. Добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
6. Добавить в MovieFactory.getMovie получение объекта Triller для ключа "triller".

7. Считать с консоли несколько ключей (строк).
7.1. Ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "triller", "soapOpera".
8. Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1. Получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
8.2. Вывести на экран movie.getClass().getSimpleName().
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //ввести с консоли несколько ключей (строк), пункт 7

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String key = br.readLine();
            if (key.equals("soapOpera") || key.equals("cartoon") || key.equals("triller"))
            {
                if ("soapOpera".equals(key))
                {
                    MovieFactory.getMovie(key);
                }
                if ("cartoon".equals(key))
                {
                    MovieFactory.getMovie(key);
                }
                if ("triller".equals(key))
                {
                    MovieFactory.getMovie(key);
                }
            } else
            {
                break;
            }


        }
    }

    static class MovieFactory
    {

        static Movie getMovie(String key)
        {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key))
            {
                movie = new SoapOpera();
                System.out.println(movie.getClass().getSimpleName());
            }
            if ("cartoon".equals(key))
            {
                movie = new Cartoon();
                System.out.println(movie.getClass().getSimpleName());
            }
            if ("triller".equals(key))
            {
                movie = new Triller();
                System.out.println(movie.getClass().getSimpleName());
            }

            //Напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie
    {
    }

    static class SoapOpera extends Movie
    {
    }

    //Напишите тут ваши классы, пункт 3
    static class Triller extends Movie
    {

    }

    static class Cartoon extends Movie
    {

    }
}
