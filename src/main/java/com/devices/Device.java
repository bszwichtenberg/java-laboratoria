package com.devices;

import com.Human;
import com.Selleable;

public abstract class Device implements Selleable {

    public String producer;
    public String model;
    public Integer manufacturingYear;

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                '}';
    }

    public abstract void turnOn();

    public abstract void sell(Human seller, Human buyer, Double price);
}

