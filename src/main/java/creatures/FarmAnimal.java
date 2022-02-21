package creatures;

public class FarmAnimal extends Animal implements Edible {

    public FarmAnimal(String species, String name) {
        super(species, name);
    }

    @Override
    public void beEaten() {
        System.out.println("Możesz mnie zjeść :(");
    }
}
