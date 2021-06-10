package com.example.airlineapp;

import android.widget.ImageView;

import java.util.Date;

public class SflightEncap {
    private String fromAirport;
    private String toAirport;
    private Date deparTime;
    private Date arrTime;
    private String airlineCode;
    private String airlineName;
    private String duration;
    private Double price;

    public ImageView getFlightImage() {
        return flightImage;
    }

    public void setFlightImage(ImageView flightImage) {
        this.flightImage = flightImage;
    }

    private ImageView flightImage;

    public SflightEncap(String s) {
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public String getToAirport() {
        return toAirport;
    }

    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

    public Date getDeparTime() {
        return deparTime;
    }

    public void setDeparTime(Date deparTime) {
        this.deparTime = deparTime;
    }

    public Date getArrTime() {
        return arrTime;
    }

    public void setArrTime(Date arrTime) {
        this.arrTime = arrTime;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
