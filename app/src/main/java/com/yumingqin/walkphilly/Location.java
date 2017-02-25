package com.yumingqin.walkphilly;

/**
 * Created by monicavyavahare on 2/25/17.
 */

public class Location {
        private double lat;
        private double longit;
        private String name;
        private String description;

        public Location(double lattitude, double longitude, String locName, String description){
            lat = lattitude;
            longit = longitude;
            name = locName;
            this.description = description;
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
}
