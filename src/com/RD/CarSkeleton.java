package com.RD;

public class CarSkeleton {

    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String startEngine(){
        System.out.println("classname :" + getClass().getSimpleName());
        return getName() + "start engine";
    }

    public String drive(){
        runEngine(this);
        System.out.println("classname : " + getClass().getSimpleName());
        return getName() + " driving."

    }
// asagıdaki kodda 2 farklı sout metotdu yazılmıtır örnek olarak.

    protected String runEngine(CarSkeleton skeleton){
        System.out.println(skeleton.getClass().getSimpleName());
        if (skeleton instanceof ElectiricCar) {
            double batterySize = ((ElectiricCar) skeleton).getBatterySize();
            System.out.println(" batery size :" + batterySize );
        } else if ( skeleton instanceof  HybridCar) {
            HybridCar hybridCar = ((HybridCar) skeleton);
            System.out.println("hybrid per liter :" + hybridCar.getAverage() );

        }

    }
}
