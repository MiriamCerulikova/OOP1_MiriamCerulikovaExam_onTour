package com.nhlstenden.ontour;

public class Ticket
{
    private String code;

    public Ticket(String code, Concert concert)
    {
        this.code = code;
    }

    public String getCode()
    {
        return this.code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }
}