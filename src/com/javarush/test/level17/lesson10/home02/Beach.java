package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/

import java.util.TreeSet;


public class Beach implements Comparable<Beach>
{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality)
    {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName()
    {
        return name;
    }

    public synchronized void setName(String name)
    {
        this.name = name;
    }

    public synchronized float getDistance()
    {
        return distance;
    }

    public synchronized void setDistance(float distance)
    {
        this.distance = distance;
    }

    public synchronized int getQuality()
    {
        return quality;
    }

    public synchronized void setQuality(int quality)
    {
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach o)
    {
        int distanceParam = (int) (distance - o.getDistance());
        int qualityParam = quality - o.getQuality();
        return name.compareTo(o.getName()) + distanceParam + qualityParam;


    }

    public static void main(String[] args)
    {

        TreeSet<Beach> beachSet = new TreeSet<Beach>();

        beachSet.add(new Beach("beach1", 125.6f, 7));
        beachSet.add(new Beach("beach2", 124.6f, 8));
        beachSet.add(new Beach("beach3", 124.6f, 7));
        beachSet.add(new Beach("beach4", 124.2f, 7));
        beachSet.add(new Beach("beach5", 124.6f, 9));
        beachSet.add(new Beach("beach6", 124.6f, 6));

        for (Beach x : beachSet)
        {
            System.out.println(x.getName() + " " + x.getDistance() + " " + x.getQuality());
        }
    }
}