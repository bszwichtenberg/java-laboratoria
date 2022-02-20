public class Car {

    public String producer;
    public String model;
    public Integer manufacturingYear;
    public Double engineCapacity ;

    public Car(String producer, String model, Integer manufacturingYear, Double engineCapacity) {
        this.model = model;
        this.manufacturingYear = manufacturingYear;
        this.producer = producer;
        this.engineCapacity = engineCapacity;
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
}
