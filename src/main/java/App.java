import devices.Car;
import devices.Phone;

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
        Car car = new Car("Alfa Romeo","159",2010,2.0, 25000.00);


        person.setSalary(15000.00);

        person.setCar(car);

        Car car2 = new Car("Fiat","multipla",1990,1.0, 1000.0);
        person.setCar(car2);

        Car car3 = new Car("Fiat", "multipla", 1990, 1.0, 1000.0);

        Phone phone = new Phone("Samsung", "A5", 15.0, "Android");


        System.out.println(pet);
        System.out.println(car2.equals(car3));

        System.out.println(pet.toString());
        System.out.println(car.toString());
        System.out.println(person.toString());
        System.out.println(phone.toString());
    }
}
