package com.testing.coordinates.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
public class Coordinates {

    private double latitude1;

    private double longitude1;

    private double latitude2;

    private double longitude2;

    private double distance;

    public Coordinates(double latitude_1, double longitude_1) {
        this.latitude1 = latitude_1;
        this.longitude1 = longitude_1;
    }


    public double getLatitude1() {
        return latitude1;
    }
    public double getLongitude1() {
        return longitude1;
    }

    public double getLatitude2() {
        return latitude2;
    }

    public double getLongitude2() {
        return longitude2;
    }

    public Coordinates() {

    }
    public Coordinates(double latitude_1, double longitude_1, double latitude_2, double longitude_2, double distance) {
            this.latitude1 = latitude_1;
            this.longitude1 = longitude_1;
            this.latitude2 = latitude_2;
            this.longitude2 = longitude_2;
            this.distance = distance;
        }
        
}

