package creatures;

public abstract class Animal implements Feedable{

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
        return "creatures.Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void feed(double foodWeight) {
        System.out.println("Zjadłem tyyle jedzenia: " + foodWeight);
        this.weight += foodWeight;
    }

}
