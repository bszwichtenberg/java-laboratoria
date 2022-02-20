package devices;

import java.util.Objects;

public class Car {

    public String producer;
    public String model;
    public Integer manufacturingYear;
    public Double engineCapacity ;
    public Double value;

    public Car(String producer, String model, Integer manufacturingYear, Double engineCapacity, Double value) {
        this.model = model;
        this.manufacturingYear = manufacturingYear;
        this.producer = producer;
        this.engineCapacity = engineCapacity;
        this.value = value;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(Integer manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
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
