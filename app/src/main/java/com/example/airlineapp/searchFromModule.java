package com.example.airlineapp;

public class searchModule {
    private String airportCode;
    private String airportName;

    public searchModule(String airportCode, String airportName) {
        this.airportCode = airportCode;
        this.airportName = airportName;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }
}
