package com.javarush.test.level14.lesson02.task01;

/* Bingo
Исправь строчку 'Object o = new Pet();' в методе main так, чтобы программа вывела "Bingo!"
*/

public class Solution
{
    public static void main(String[] args)
    {
        Object o = new Tiger();
        boolean isCat = o instanceof Cat;
        System.out.println(isCat);
        boolean isTiger = o instanceof Tiger;
        System.out.println(isTiger);
        boolean isPet = o instanceof Pet;
        System.out.println(isPet);

        printResults(isCat, isTiger, isPet);
    }

    private static void printResults(boolean cat, boolean tiger, boolean pet)
    {
        if (cat && tiger && pet) System.out.println("Bingo!");
    }

    static class Pet
    {
    }

    static class Cat extends Pet
    {
    }

    static class Tiger extends Cat
    {
    }

}
