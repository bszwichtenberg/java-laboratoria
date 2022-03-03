package com;

import com.devices.Car;
import com.devices.Phone;

public class Human implements Selleable {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    private Car car;
    private Double salary;
    public Double cash;


    public Human(String firstName, String lastName, Double cash) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
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

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Car getCar() {
        return this.car;
    }

    public Double getSalary() {
        return this.salary;
    }

    public Double getCash() {
        return this.cash;
    }

    public void setCash(Double cash){
        this.cash = cash;
    }

    public void setSalary(Double salary) {
        if (salary > 0.0) {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
            System.out.println("Odbierz aneks do umowy u pani Hani z kadr!");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty. Nic nie ukryjesz! Mati już zaciera ręce :D");
            this.salary = salary;
        } else {
            System.out.println("Wynagrodzenie nie może być ujemne!");
        }
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "com.Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", pet=" + pet +
                ", car=" + car +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Handel ludźmi jest zakazany!");
    }
}
