package org.example;

import org.example.interfaceSegregation.PrimaryDiscount;
import org.example.interfaceSegregation.SecondaryDiscount;

public class Main {
    public static void main(String[] args) {
//        AbstractSale sale = new InternationalSale(3000, 20);
//        sale.calculatePrice();
//        sale = new InterstellarSale(3000, 20);
//        sale.calculatePrice();
//        sale = new LocalSale(3000, 20);
//        sale.calculatePrice();
//        sale = new AnySale(3, 3);

        Sale sale = new Sale("", 3000, 3, new SecondaryDiscount());
    }
}

