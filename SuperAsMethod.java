package com.keyword;

class Bikes
{
    public void mileage()
    {
        System.out.println("The Average Mileage should be 50 km/hr ");
    }
}

class Scooter extends Bikes
{
    public void mileage()
    {
        super.mileage();
        System.out.println("The Average Mileage of this bike is 45 km/hr " );
    }
}


public class SuperAsMethod
{
    public static void main(String[] args)
    {
        Scooter obj = new Scooter();
        obj.mileage();

    }
}

