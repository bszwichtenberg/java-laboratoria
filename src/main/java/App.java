public class App {
    public static void main(String[] args) {

        Human person = new Human("Adam", "Kowalski","690-123-123");
        Car car = new Car("Alfa Romeo","159",2010,2.0);

        person.setCar(car);
    }
}
