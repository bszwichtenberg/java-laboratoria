package devices;

public class Phone extends Device {

    public Double screenSize;
    public String androidIOS;

    public Phone(String producer, String model, Double screenSize, String androidIOS) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.androidIOS = androidIOS;
    }


    @Override
    public String toString() {
        return "devices.Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", androidIOS='" + androidIOS + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Ring! Ring! To ja, Twój telefon!");
    }
}
