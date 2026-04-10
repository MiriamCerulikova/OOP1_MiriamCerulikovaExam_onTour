package com.nhlstenden.ontour;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TourManager
{
    private String name;
    private int maxAmountOfArtists;
    private List<Artist> artists;
    private List<Venue> venues;
    private List<Concert> concerts;

    public TourManager(String name, int maxAmountOfArtists)
    {
        if (this.name == null)
        {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (this.artists.size() <= 0)
        {
            throw new IllegalArgumentException("The number of artists must be either 0 or more");
        }
        this.name = name;
        this.maxAmountOfArtists = maxAmountOfArtists;
        this.artists = new ArrayList<>();
        this.venues = new ArrayList<>();
        this.concerts = new ArrayList<>();
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getMaxAmountOfArtists()
    {
        return this.maxAmountOfArtists;
    }

    public void setMaxAmountOfArtists(int maxAmountOfArtists)
    {
        this.maxAmountOfArtists = maxAmountOfArtists;
    }

    public List<Artist> getArtists()
    {
        return this.artists;
    }

    public void setArtists(List<Artist> artists)
    {
        this.artists = artists;
    }

    public List<Venue> getVenues()
    {
        return this.venues;
    }

    public void setVenues(List<Venue> venues)
    {
        this.venues = venues;
    }

    public List<Concert> getConcerts()
    {
        return this.concerts;
    }

    public void setConcerts(List<Concert> concerts)
    {
        this.concerts = concerts;
    }

    public void addArtist (Artist artist)
    {
        if (this.artists.size() >= this.maxAmountOfArtists)
        {
            throw new IllegalArgumentException("Cannot add new Artist, the maximum amount of artist has been reached");
        }

        this.artists.add(artist);
    }

    public void addVenue (Venue venue)
    {
        this.venues.add(venue);
    }

    public void scheduleConcert (Concert concert, Artist artist, Venue venue, LocalDate date)
    {
        for ()
        {
            throw new IllegalArgumentException("The artist or venue doesn't exist");
        }

        this.concerts.add(concert);
    }

    public Concert getConcert(Artist artist, Venue venue, LocalDate date)
    {
        List<Concert> specificConcert = new ArrayList<>();

        for (Concert concert : this.getConcertsByArtist())
        {
            specificConcert.add(concert);
        }

        return specificConcert;
    }

    public List<Concert> getConcertsByArtist(List<Concert> concerts,Artist artist)
    {
        List<Concert> concertsByArtist = new ArrayList<>();

        for (Concert concert : this.concerts)
        {
            if (this.concerts.equals(artist))
            {
                concertsByArtist.add(concert);
            }
        }

        return concertsByArtist;
    }

    public List<Concert> getConcertsByVenue(List<Concert> concerts, Venue venue)
    {
        List<Concert> concertsByVenue = new ArrayList<>();

        for (Concert concert : this.concerts)
        {
            if (this.concerts.equals(venue))
            {
                concertsByVenue.add(concert);
            }
        }

        return concertsByVenue;
    }

    public List<Concert> getConcertsByDate(List<Concert> concerts, LocalDate date)
    {
        List<Concert> concertsByDate = new ArrayList<>();

        for (Concert concert : this.concerts)
        {
            if (this.concerts.equals(date))
            {
                concertsByDate.add(concert);
            }
        }

        return concertsByDate;
    }

    public int getRevenuePerConcert()
    {
        int total = 0;

        for (Concert concert : this.concerts)
        {
            total += concert.getPriceInEuro() * concert.getSoldTickets().size();
        }

        return total;
    }

}
