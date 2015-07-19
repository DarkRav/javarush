package com.javarush.test.level13.lesson11.bonus03;

public class AbstractRobot extends Robot implements Attackable, Defensable
{

    private static int hitCount;
    private String name;

    public AbstractRobot(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public BodyPart attack()
    {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1)
        {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2)
        {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3)
        {
            attackedBodyPart = BodyPart.GRU;
        } else if (hitCount == 4)
        {
            hitCount = 0;
            attackedBodyPart = BodyPart.LEG;
        }
        return attackedBodyPart;
    }

    public BodyPart defense()
    {
        BodyPart defencedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1)
        {
            defencedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2)

        {
            defencedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3)
        {
            defencedBodyPart = BodyPart.GRU;
        } else if (hitCount == 4)
        {
            hitCount = 0;
            defencedBodyPart = BodyPart.ARM;
        }
        return defencedBodyPart;
    }
}
