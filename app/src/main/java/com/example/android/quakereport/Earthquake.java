package com.example.android.quakereport;

/**
 * Created by WanChing on 2/7/2017.
 */

public class Earthquake {

    private String magnitude;
    private String location;
    private String time;

    public Earthquake(String magnitude, String location, String time){
        this.magnitude = magnitude;
        this.location = location;
        this.time = time;
    }

    public String getMagnitude(){
        return  magnitude;
    }

    public String getLocation(){
        return  location;
    }

    public String getTime(){
        return  time;
    }
}
