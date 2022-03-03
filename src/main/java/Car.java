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

}
