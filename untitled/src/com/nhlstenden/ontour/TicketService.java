package com.nhlstenden.ontour;

import java.time.LocalDate;

public class TicketService
{
    private TourManager tourManager;

    public TicketService(TourManager tourManager)
    {
        if (this.tourManager == null)
        {
            throw new IllegalArgumentException("The Tour Manager must not be empty");
        }
        this.tourManager = tourManager;
    }

    public TourManager getTourManager()
    {
        return this.tourManager;
    }

    public void setTourManager(TourManager tourManager)
    {
        this.tourManager = tourManager;
    }

    public void sellTickets(String artistName, String venueName, LocalDate date, int amountOfTickets)
    {
        if (tourManager.getConcert() == null)
        {
            throw new IllegalArgumentException("The Concert doesn't exist");
        }
    }

    public int getTotalRevenue()
    {
        int total = 0;

        for (Concert concert : getTourManager().getConcertsByArtist())
        {
            total += tourManager.getRevenuePerConcert();
        }

        return total;
    }
}
