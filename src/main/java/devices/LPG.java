package devices;

public class LPG extends Car {

    public LPG(String producer, String model, Integer manufacturingYear, Double engineCapacity, Double value) {
        super(producer, model, manufacturingYear, engineCapacity, value);
    }

    @Override
    public void refuel() {
        System.out.println("Tankuję gaz");
    }
}
