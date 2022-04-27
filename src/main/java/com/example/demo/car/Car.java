package com.example.demo.car;

public class Car {
    private Long id;
    private String brand;
    private String yearOfProduction;
    private String color;

    public Car() {
    }

    public Car(Long id, String brand, String yearOfProduction, String color) {
        this.id = id;
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
    }

    public Car(String brand, String yearOfProduction, String color) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(String yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

