package org.example;

public class AnySale {
    protected float amount;
    protected float taxes;

    public AnySale(float amount, float taxes) {
        this.amount = amount;
        this.taxes = taxes;
    }

    public float calculate() {
        return amount - taxes;
    }
}
