package com.javarush.test.level21.lesson16.big01;


import java.util.*;

public class Hippodrome
{
    public static Hippodrome game;

    public ArrayList<Horse> getHorses()
    {

        return horses;
    }

    static ArrayList<Horse> horses = new ArrayList<Horse>();

    public void run() throws InterruptedException
    {
        for (int i = 0; i < 20; i++)
        {
            move();
            print();
            Thread.sleep(500);
        }
    }

    public void move()
    {
        for (Horse horse : horses)
        {
            horse.move();
        }
    }

    public void print()
    {
        for (Horse horse : horses)
        {
            horse.print();
            System.out.println();

        }
    }

    public Horse getWinner()
    {

        return null;
    }

    public void printWinner()
    {

    }

    public static void main(String[] args) throws InterruptedException
    {
        Hippodrome horse = new Hippodrome();
        Hippodrome.game = horse;
        Horse horse1 = new Horse("Sleven", 3, 0);
        Horse horse2 = new Horse("Lucky", 3, 0);
        Horse horse3 = new Horse("Gomer", 3, 0);
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game.run();
    }
}
