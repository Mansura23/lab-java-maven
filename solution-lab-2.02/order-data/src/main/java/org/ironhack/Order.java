package org.ironhack;

import java.util.List;

public class Order {

    private int orderId;
    private String customer;
    private double total;
    private List<OrderItem> items;

    public Order(int orderId, String customer, double total, List<OrderItem> items) {
        this.orderId = orderId;
        this.customer = customer;
        this.total = total;
        this.items = items;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId +
                "\nCustomer: " + customer +
                "\nItems: " + items +
                "\nTotal: " + total;
    }
}
