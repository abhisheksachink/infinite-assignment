package org.example;


public class powerConsumption {
    public double powerPrice(String PowerType,double unit) {
        double price;
        double discount;
        if (PowerType.equals("domestic")) {
            if (unit < 200) {
                price = 5 * unit;
                discount = 0.5 * price;
                price = (price - discount) + 250;
                return price;
            } else {
                price = 5 * unit;
                price = price + 250;
                return price;
            }
        }
        if (PowerType.equals("industrial")) {
            if (unit < 1000) {
                price = 8 * unit;
                discount = 0.1 * price;
                price = (price - discount) + 500;
                return price;
            } else {
                price = 8 * unit;
                price = price + 500;
                return price;
            }
        }
        return 0;

    }
}
