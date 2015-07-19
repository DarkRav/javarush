package com.javarush.test.level14.lesson06.home01;

/**
 * Created by i3 on 14.03.2015.
 */
public class UkrainianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 1;
    }

    @Override
    String getDescription()
    {
        return super.getDescription() + " Моя страна - "+Country.UKRAINE+ ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

    }
}
