package com.devices;

import com.Human;

import java.util.Objects;

public class Car extends Device {


    public Double engineCapacity ;
    public Double value;

    public Car(String producer, String model, Integer manufacturingYear, Double engineCapacity, Double value) {
        this.model = model;
        this.manufacturingYear = manufacturingYear;
        this.producer = producer;
        this.engineCapacity = engineCapacity;
        this.value = value;
    }


    @Override
    public String toString() {
        return "com.devices.Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                ", engineCapacity=" + engineCapacity +
                ", value=" + value +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Brum brum bruuuuum");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getCar() != null && seller.getCar().equals(this)){
            if(buyer.getCash() != null && buyer.getCash() >= price) {
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.cash + price);
                seller.setCar(null);
                buyer.setCar(this);
                System.out.println("Samochód został sprzedany");
                System.out.println("Stan konta sprzedającego po transakcji: " + seller.getCash());
                System.out.println("Stan konta kupującego po transakcji: " + buyer.getCash());
            } else {
                System.out.println("Kupujący nie posiada odpowiednich środków, żeby zrealizować transakcję");
            }
        } else {
            System.out.println("Nie można sprzedać samochodu, bo sprzedający nie jest jego właścicielem!");
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(producer, car.producer) &&
                Objects.equals(model, car.model) &&
                Objects.equals(manufacturingYear, car.manufacturingYear) &&
                Objects.equals(engineCapacity, car.engineCapacity) &&
                Objects.equals(value, car.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, manufacturingYear, engineCapacity, value);
    }
}
