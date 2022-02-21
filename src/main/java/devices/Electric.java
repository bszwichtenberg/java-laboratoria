package devices;

public class Electric extends Car {

    public Electric(String producer, String model, Integer manufacturingYear, Double engineCapacity, Double value) {
        super(producer, model, manufacturingYear, engineCapacity, value);
    }

    @Override
    public void refuel() {
        System.out.println("Laduję akumulator");
    }

}
