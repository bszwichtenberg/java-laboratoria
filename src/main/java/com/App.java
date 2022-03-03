package com;

import com.devices.Car;
import com.devices.Phone;

public class App {
    public static void main(String[] args) {

        Animal pet = new Animal("Cat", "Felek");

        Human seller = new Human("Adam", "Kowalski", 0.0);
        seller.setPet(pet);

        Human buyer = new Human("Jan", "Kowalski", 5000.00);

        pet.sell(seller, buyer, 1000.00);

        Animal dog = new Animal("Dog", "Azor");
        dog.sell(buyer, seller, 500.0);

        buyer.setPet(dog);
        seller.setCash(0.0);
        dog.sell(buyer, seller, 500.0);

        Human sellerForSale = new Human("Anna", "Wilczewska",  0.0);
        sellerForSale.sell(buyer, seller, 50000.00);

        Phone iPhone = new Phone("Apple", "Iphone 6", 18.0, "iOS");

        seller.setPhone(iPhone);
        buyer.setCash(5000.00);

        iPhone.sell(seller, buyer, 3000.00);

        Phone samsung = new Phone("Samsung", "A2016", 16.3, "android");

        samsung.sell(seller, buyer, 1500.00);

        Car polonez = new Car("FSO", "Polonez Caro", 1990, 1.6, 2500.00);
        seller.setCar(polonez);

        polonez.sell(seller, buyer, 2500.00);

        polonez.sell(seller, buyer, 2000.00);

        Car ford = new Car("Ford", "Focus", 2005, 1.3, 3000.0);
        ford.sell(buyer, seller, 3000.0);
    }
}
