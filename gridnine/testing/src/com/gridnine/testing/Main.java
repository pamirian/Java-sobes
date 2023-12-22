package com.gridnine.testing;

import com.gridnine.testing.FlightBuilder;
import com.gridnine.testing.Flight;
import com.gridnine.testing.FlightFilterBuilderImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();
        List<Flight> flightsDepartureBeforeNow = new FlightFilterBuilderImpl(flights)
                .filterDepartureBeforeNow()
                .build();
        List<Flight> flightsArrivalBeforeDeparture = new FlightFilterBuilderImpl(flights)
                .filterArrivalBeforeDeparture()
                .build();
        List<Flight> flightsTimeOnGroundMoreThanTwoHours = new FlightFilterBuilderImpl(flights)
                .filterSumTimeOnGroundMoreThanTwoHours()
                .build();

        System.out.println("Unfiltered flies:\n" + flights);
        System.out.println("Departure before now:\n" + flightsDepartureBeforeNow);
        System.out.println("Arrival before departure:\n" + flightsArrivalBeforeDeparture);
        System.out.println("Time on the ground is more than two hours:\n" + flightsTimeOnGroundMoreThanTwoHours);
    }
}
