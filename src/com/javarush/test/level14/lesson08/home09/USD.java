package com.javarush.test.level14.lesson08.home09;

/**
 * Created by admin on 11.08.14.
 */
public class USD extends Money
{
    public USD(double amount)
    {
        super(amount);
    }

    @Override
    public String getCurrencyName()
    {
        return "USD";
    }
}
