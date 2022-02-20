package devices;

public abstract class Device {

    public String producer;
    public String model;
    public Integer manufacturingYear;

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                '}';
    }

    public abstract void turnOn();
}

