package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;

interface FlightFilter {
    List<Flight> filter(List<Flight> flights);
}

class DepartureBeforeCurrentTimeFilter implements FlightFilter {
    @Override
    public List<Flight> filter(List<Flight> flights) {
        LocalDateTime currentTime = LocalDateTime.now();
        return flights.stream()
                .filter(flight -> flight.getSegments().stream()
                        .allMatch(segment -> segment.getDepartureDate().isAfter(currentTime)))
                .toList();
    }
}

class ArrivalBeforeDepartureFilter implements FlightFilter {
    @Override
    public List<Flight> filter(List<Flight> flights) {
        return flights.stream()
                .filter(flight -> flight.getSegments().stream()
                        .allMatch(segment -> segment.getArrivalDate().isAfter(segment.getDepartureDate())))
                .toList();
    }
}

class GroundTimeExceedsTwoHoursFilter implements FlightFilter {
    @Override
    public List<Flight> filter(List<Flight> flights) {
        return flights.stream()
                .filter(flight -> flight.getSegments().stream()
                        .mapToLong(segment -> {
                            LocalDateTime nextDeparture = flight.getSegments().stream()
                                    .filter(s -> s.getDepartureDate().isAfter(segment.getArrivalDate()))
                                    .map(Segment::getDepartureDate)
                                    .min(LocalDateTime::compareTo)
                                    .orElse(null);
                            return nextDeparture == null ? 0 :
                                    segment.getArrivalDate().until(nextDeparture).toHours();
                        })
                        .anyMatch(groundTime -> groundTime <= 2))
                .toList();
    }
}

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();

        FlightFilter departureFilter = new DepartureBeforeCurrentTimeFilter();
        FlightFilter arrivalFilter = new ArrivalBeforeDepartureFilter();
        FlightFilter groundTimeFilter = new GroundTimeExceedsTwoHoursFilter();

        System.out.println("Flights after departure filter:");
        departureFilter.filter(flights).forEach(System.out::println);

        System.out.println("\nFlights after arrival filter:");
        arrivalFilter.filter(flights).forEach(System.out::println);

        System.out.println("\nFlights after ground time filter:");
        groundTimeFilter.filter(flights).forEach(System.out::println);
    }
}
