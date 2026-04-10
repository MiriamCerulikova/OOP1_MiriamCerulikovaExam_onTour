package com.nhlstenden.ontour;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concert
{
    private Artist artist;
    private Venue venue;
    private LocalDate date;
    private List<Ticket> soldTickets;
    private int priceInEuro;

    public Concert(Artist artist, Venue venue, LocalDate date,  int priceInEuro)
    {
        if (this.priceInEuro < 0)
        {
            throw new IllegalArgumentException("Price must be greater than 0");
        }
        this.artist = artist;
        this.venue = venue;
        this.date = date;
        this.soldTickets = new ArrayList<>();
        this.priceInEuro = priceInEuro;
    }

    public Artist getArtist()
    {
        return this.artist;
    }

    public void setArtist(Artist artist)
    {
        this.artist = artist;
    }

    public Venue getVenue()
    {
        return this.venue;
    }

    public void setVenue(Venue venue)
    {
        this.venue = venue;
    }

    public LocalDate getDate()
    {
        return this.date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public List<Ticket> getSoldTickets()
    {
        return this.soldTickets;
    }

    public void setSoldTickets(List<Ticket> soldTickets)
    {
        this.soldTickets = soldTickets;
    }

    public int getPriceInEuro()
    {
        return this.priceInEuro;
    }

    public void setPriceInEuro(int priceInEuro)
    {
        this.priceInEuro = priceInEuro;
    }

    public boolean hasOccured()
    {
        if (LocalDate.now().isAfter(this.date));
        {
            return true;
        }

        return false;
    }

    public void addTicket(Ticket ticket)
    {
        this.soldTickets.add(ticket);
    }

    public void removeTicket(Ticket ticket)
    {
        this.soldTickets.remove(ticket);
    }

    public int getAmountOfTickets()
    {
        return this.soldTickets.size();
    }

}
