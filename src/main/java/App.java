public class App {
    public static void main(String[] args) {

        Animal pet = new Animal("Cat", "Felek");

        pet.feed();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.feed();

        Human person = new Human("Adam", "Kowalski","690-123-123");
        Car car = new Car("Alfa Romeo","159",2010,2.0);

        person.setCar(car);
        person.setSalary(1500.00);

        person.setSalary(-1.00);
    }
}
