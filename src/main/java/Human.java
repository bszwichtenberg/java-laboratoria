import java.util.Date;

public class Human {
    public String firstName;
    public String lastName;
    public String phone;
    public Animal pet;
    public Car car;
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

    public void setCar(Car car) {
        this.car = car;
    }

    public Double getSalary() {
        return salary;
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
}
