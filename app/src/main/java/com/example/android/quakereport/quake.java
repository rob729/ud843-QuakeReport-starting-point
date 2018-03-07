package com.example.android.quakereport;

/**
 * Created by robin on 4/3/18.
 */

public class quake {
    private double  mag;
    private String place;
    private long time;
    private String url;

    public quake(double qmag,String qplace,long qtime,String qurl){
        mag=qmag;
        place=qplace;
        time=qtime;
        url=qurl;
    }
    public double  getMag(){ return mag;}
    public String getPlace(){ return place;}
    public long getTime1(){ return time;}
    public String getUrl(){ return url;}
}
