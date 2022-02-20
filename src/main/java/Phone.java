public class Phone {

    public String producer;
    public String model;
    public Double screenSize;
    public String androidIOS;

    public Phone(String producer, String model, Double screenSize, String androidIOS) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.androidIOS = androidIOS;
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

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    public String getAndroidIOS() {
        return androidIOS;
    }

    public void setAndroidIOS(String androidIOS) {
        this.androidIOS = androidIOS;
    }
}
