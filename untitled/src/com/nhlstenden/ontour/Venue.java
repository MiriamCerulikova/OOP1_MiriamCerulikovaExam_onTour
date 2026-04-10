package com.nhlstenden.ontour;

public class Venue
{
    private String name;
    private String city;
    private int maxCapacity;

    public Venue(String name, String city, int maxCapacity)
    {
        if (this.name == null)
        {
            throw new IllegalArgumentException("The name cannot be empty");
        }

        if (this.city == null)
        {
            throw new IllegalArgumentException("The city cannot be empty");
        }

        if (this.maxCapacity < 0)
        {
            throw new IllegalArgumentException("The maximum capacity must be greater than 0");
        }
        this.name = name;
        this.city = city;
        this.maxCapacity = maxCapacity;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCity()
    {
        return this.city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public int getMaxCapacity()
    {
        return this.maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity)
    {
        this.maxCapacity = maxCapacity;
    }
}
