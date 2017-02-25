package com.yumingqin.walkphilly;

/**
 * Created by monicavyavahare on 2/25/17.
 */

public class Location implements Comparable{
    private double lat;
    private double longit;
    private String name;
    private String description;
    private double dist;

    public Location(double lattitude, double longitude, String locName, String description){
        lat = lattitude;
        longit = longitude;
        name = locName;
        this.description = description;
        dist = -999;

    }

    public String getDescription() {
        return description;
    }

    public double getLat(){
        return lat;
    }

    public double getLongit(){
        return longit;
    }

    public String getName(){
        return name;
    }

    public void setDistance(double distance){
        dist = distance;
    }

    public double getDistance() {
        return dist;
    }

    @Override
    public int compareTo(Object other){
        double compare = this.getDistance() - ((Location) other).getDistance();
        if(compare == 0){
            return 0;
        } else if (compare > 0){
            return 1;
        } else {
            return -1;
        }
    }
}
