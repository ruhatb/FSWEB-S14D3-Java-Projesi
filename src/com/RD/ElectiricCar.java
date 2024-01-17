package com.RD;

public class ElectiricCar extends CarSkeleton{
    private double averageKmPerCharge;
    private int batterySize;

    public ElectiricCar(String name, String description, double averageKmPerCharge, int batterySize) {
        super(name, description);
        this.averageKmPerCharge = averageKmPerCharge;
        this.batterySize = batterySize;
    }
}
