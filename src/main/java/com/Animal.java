package com;

public class Animal implements Selleable {

    public final String species;
    private Double weight;
    public String name;

    public Animal(String species, String name) {
        this.species = species;
        if(species.equals("Dog")){
            this.weight = 5.0;}
        else {
            if(species.equals("Cat")) {
                this.weight = 3.0;
            }
            else {
                this.weight = 2.5;
            }
        }
        this.name = name;
    }

    public void feed() {
        if(this.weight > 0) {
            this.weight = weight + 0.5;
            System.out.println("Mniam mniam mniam");
        } else {
            System.out.println("Uśmierciłeś zwierzaka! :(");
        }
    }

    public void takeForAWalk() {
        if(this.weight > 0){
            this.weight = weight - 0.5;
            System.out.println("Idziemy na spacer!");
        } else {
            System.out.println("Uśmierciłeś zwierzaka! :(");
        }
    }

    @Override
    public String toString() {
        return "com.Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getPet() != null && seller.getPet().equals(this)){
            if(buyer.getCash() != null && buyer.getCash() >= price) {
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.cash + price);
                seller.setPet(null);
                buyer.setPet(this);
                System.out.println("Zwierzę zostało sprzedane");
                System.out.println("Stan konta sprzedającego po transakcji: " + seller.getCash());
                System.out.println("Stan konta kupującego po transakcji: " + buyer.getCash());
            } else {
                System.out.println("Kupujący nie posiada odpowiednich środków, żeby zrealizować transakcję");
            }
        } else {
            System.out.println("Nie można sprzedać zwierzęcia, bo sprzedający nie jest jego właścicielem!");
        };
    }
}
