package com.tr.task03.entity;

public class Appliance {

    private int id;
    private String category;
    private double price;

    public Appliance() {

    }

    public Appliance(int id, String category, double price) {
        this.id = id;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Appliance{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
