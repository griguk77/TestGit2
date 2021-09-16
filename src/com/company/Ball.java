package com.company;

public class Ball {
    private String brand;
    private int size;
    private String color;

    public Ball (String brand, int size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getSize() {
        return this.size;
    }

    public String getColor() {
        return this.color;
    }
    @Override
    public String toString() {
        return "Бренд: " + this.brand + ", размер: " + this.size + ", цвет: " + this.color;
    }
}