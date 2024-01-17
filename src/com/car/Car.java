package com.car;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;

    private int wheels ;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine=true;
        this.wheels=4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String startEngine(){
        return getClass().getSimpleName() + "the cars engine is starting";
    }

    public String accelerate(){
        return getClass().getSimpleName() + "the cars is accelerating";
    }

    public String brake(){
        return getClass().getSimpleName() + "the cars is braking";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
    class Mitsubishi extends Car{
        public Mitsubishi(int cylinders, String name) {
            super(cylinders, name);
        }
    }

    class Holden extends Car{
    public Holden (int cylinders, String name){
        super(cylinders,name);
    }

        @Override
        public String startEngine() {
            super.startEngine();
            return getName() + "motor calıstı";
        }

        @Override
        public String accelerate() {
            return super.accelerate();
        }

        @Override
        public String brake() {
            return super.brake();
        }
    }

    class Ford extends Car{
        public Ford(int cylinders, String name) {
            super(cylinders, name);
        }
    }


