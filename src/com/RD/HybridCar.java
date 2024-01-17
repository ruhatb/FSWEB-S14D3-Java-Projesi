package com.RD;

public class HybridCar extends CarSkeleton{
    private double average;
    private  int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double average, int batterySize, int cylinders) {
        super(name, description);
        this.average = average;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}
