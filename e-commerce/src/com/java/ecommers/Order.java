package com.java.ecommers;

public class Order {
    private int orderId;
    private int productId;
    private int customerId;
    private int quantity;
    private double totalCost;
    private double deliveryCharges;
    private double finalCost;

    // Constructors, getters, and setters
    public Order(int productId, int customerId, int quantity, double totalCost, double deliveryCharges, double finalCost) {
        this.productId = productId;
        this.customerId = customerId;
        this.quantity = quantity;
        this.totalCost = totalCost;
        this.deliveryCharges = deliveryCharges;
        this.finalCost = finalCost;
    }

    // Getters and Setters
    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }
    public int getCustomerId() { return customerId; }
    public void setCustomerId(int customerId) { this.customerId = customerId; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getTotalCost() { return totalCost; }
    public void setTotalCost(double totalCost) { this.totalCost = totalCost; }
    public double getDeliveryCharges() { return deliveryCharges; }
    public void setDeliveryCharges(double deliveryCharges) { this.deliveryCharges = deliveryCharges; }
    public double getFinalCost() { return finalCost; }
    public void setFinalCost(double finalCost) { this.finalCost = finalCost; }
}

