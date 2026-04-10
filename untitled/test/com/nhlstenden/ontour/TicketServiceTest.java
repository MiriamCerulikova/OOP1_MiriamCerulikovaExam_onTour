package com.nhlstenden.ontour;

import static org.junit.jupiter.api.Assertions.*;

class TicketServiceTest
{

    @org.junit.jupiter.api.Test
    void getTotalRevenue_withOneRevenue_return_oneEuro()
    {
        // Arrange
        TicketService ticketservice = new TicketService(new TourManager("Manager", 2));
        Concert concert = new Concert("Rihanna", "Dunno", 2026. 04. 04);

        this.

        // Act
        int totalRevenue = ticketservice.getTotalRevenue();

        // Assert
        assertEquals(1, totalRevenue);

    }
}