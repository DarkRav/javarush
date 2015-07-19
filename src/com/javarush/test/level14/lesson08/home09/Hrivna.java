package com.javarush.test.level14.lesson08.home09;

/**
 * Created by admin on 11.08.14.
 */
public class Hrivna extends Money
{
    public Hrivna(double amount)
    {
        super(amount);
    }

    public String getCurrencyName()
    {
        return "HRN";
    }
}
