import creatures.Animal;
import devices.Car;

public class Human {
    public String firstName;
    public String lastName;
    public String phone;
    public Animal pet;
    private Car car;
    private Double salary;



    public Human(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Car getCar() {
        return car;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        if(salary > 0.0) {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
            System.out.println("Odbierz aneks do umowy u pani Hani z kadr!");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty. Nic nie ukryjesz! Mati już zaciera ręce :D");
            this.salary = salary;
        } else {
            System.out.println("Wynagrodzenie nie może być ujemne!");
        }
    }

    public void setCar(Car car) {
        if(this.salary > car.value) {
            this.car = car;
            System.out.println("Kupiłeś samochód za gotówkę. Gratulacje!");
        } else {
            if(this.salary > car.value/2){
                System.out.println("Kupiłeś auto na kredyt..." );
            } else {
                System.out.println("Nic z tego! Idź na studia i zmień pracę!");
            }
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", pet=" + pet +
                ", car=" + car +
                ", salary=" + salary +
                '}';
    }
}
