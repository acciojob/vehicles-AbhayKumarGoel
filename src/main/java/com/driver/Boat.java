package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private int capacity;
    public Boat(String name,int capacity){
        this.capacity=capacity;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public String getVehicleName(){
        return getName();
    }
    public int getVehicleCapacity(){
        return getCapacity();
    }
}
