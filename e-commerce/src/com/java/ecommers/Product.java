package com.java.ecommers;

public class Product {
    private int productId;
    private String name;
    private double cost;
    private double rating;
    private double discount;

    // Constructors, getters, and setters
    public Product(String name, double cost, double rating, double discount) {
        this.name = name;
        this.cost = cost;
        this.rating = rating;
        this.discount = discount;
    }

    // Getters and Setters
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }
    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }
    public double getDiscount() { return discount; }
    public void setDiscount(double discount) { this.discount = discount; }
}

