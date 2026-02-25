package org.ironhack;

import com.google.gson.Gson;

public class OrderProcessor {
    public static void main(String[] args) {
        String json = """
                {
                  "orderId": 1,
                  "customer": "John Doe",
                  "items": [
                    {
                      "productName": "Laptop",
                      "quantity": 1,
                      "price": 1200.50
                    },
                    {
                      "productName": "Mouse",
                      "quantity": 2,
                      "price": 25.00
                    }
                  ],
                  "total": 1250.50
                }
                """;

        Gson gson = new Gson();

        Order order = gson.fromJson(json, Order.class);

        System.out.println("Parsed Order:");

        System.out.println(order);



    }

}
