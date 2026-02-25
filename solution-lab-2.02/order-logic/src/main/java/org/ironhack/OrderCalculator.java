package org.ironhack;
import org.ironhack.Order;

import java.util.ArrayList;
import java.util.Comparator;

public class OrderCalculator {
    public double calculate(Order order) {
         return order.getItems().stream()
                .mapToDouble(item -> item.getPrice()*item.getQuantity())
                .sum();

    }

    public double filterExpensiveItems(Order order) {
        return order.getItems().stream()
                .mapToDouble(OrderItem::getPrice)
                .max().orElse(0);
    }

    public double filterCheapItems(ArrayList<OrderItem> orderItems) {
        return orderItems.stream()
                .mapToDouble(OrderItem::getPrice)
                .min().orElse(0);
    }

}
