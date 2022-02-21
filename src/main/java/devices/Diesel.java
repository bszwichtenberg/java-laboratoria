package devices;

public class Diesel extends Car {

    public Diesel(String producer, String model, Integer manufacturingYear, Double engineCapacity, Double value) {
        super(producer, model, manufacturingYear, engineCapacity, value);
    }

    @Override
    public void refuel() {
        System.out.println("Tankuję diesla");
    }
}
