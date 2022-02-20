package devices;

import java.util.Objects;

public class Car extends Device {


    public Double engineCapacity ;
    public Double value;

    public Car(String producer, String model, Integer manufacturingYear, Double engineCapacity, Double value) {
        this.model = model;
        this.manufacturingYear = manufacturingYear;
        this.producer = producer;
        this.engineCapacity = engineCapacity;
        this.value = value;
    }


    @Override
    public String toString() {
        return "devices.Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                ", engineCapacity=" + engineCapacity +
                ", value=" + value +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Brum brum bruuuuum");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(producer, car.producer) &&
                Objects.equals(model, car.model) &&
                Objects.equals(manufacturingYear, car.manufacturingYear) &&
                Objects.equals(engineCapacity, car.engineCapacity) &&
                Objects.equals(value, car.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, manufacturingYear, engineCapacity, value);
    }
}
