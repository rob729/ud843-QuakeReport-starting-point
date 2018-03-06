package com.example.android.quakereport;

/**
 * Created by robin on 4/3/18.
 */

public class quake {
    private double  mag;
    private String place;
    private long time;

    public quake(double qmag,String qplace,long qtime){
        mag=qmag;
        place=qplace;
        time=qtime;
    }
    public double  getMag(){ return mag;}
    public String getPlace(){ return place;}
    public long getTime1(){ return time;}
}
