package com.devices;

import com.Human;

public class Phone extends Device {

    public Double screenSize;
    public String androidIOS;

    public Phone(String producer, String model, Double screenSize, String androidIOS) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.androidIOS = androidIOS;
    }


    @Override
    public String toString() {
        return "com.devices.Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", androidIOS='" + androidIOS + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Ring! Ring! To ja, Twój telefon!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getPhone() != null && seller.getPhone().equals(this)){
            if(buyer.getCash() != null && buyer.getCash() >= price) {
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.cash + price);
                seller.setPhone(null);
                buyer.setPhone(this);
                System.out.println("Telefon został sprzedany");
                System.out.println("Stan konta sprzedającego po transakcji: " + seller.getCash());
                System.out.println("Stan konta kupującego po transakcji: " + buyer.getCash());
            } else {
                System.out.println("Kupujący nie posiada odpowiednich środków, żeby zrealizować transakcję");
            }
        } else {
            System.out.println("Nie można sprzedać telefonu, bo sprzedający nie jest jego właścicielem!");
        };
    }
}
