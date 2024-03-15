package org.example;

import java.util.List;

public class Sale {
    private String type; // local, internacional y interestelar
    private float amount;
    private float taxes;
    private Discount discount;

    public Sale(String type, float amount, float taxes, Discount discount) {
        this.type = type;
        this.amount = amount;
        this.taxes = taxes;
        this.discount = discount;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getTaxes() {
        return taxes;
    }

    public void setTaxes(float taxes) {
        this.taxes = taxes;
    }

    public float calculateTotalPrice (List<AbstractSale> sales) {
        float total = 0;
        for (AbstractSale sale : sales) {
            total += sale.calculatePrice();
        }

        total = this.discount.calculate(total);


        return total;
    }
}
