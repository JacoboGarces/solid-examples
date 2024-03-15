package org.example;

public abstract class  AbstractSale {
    protected float amount;
    protected float taxes;

    public AbstractSale(float amount, float taxes) {
        this.amount = amount;
        this.taxes = taxes;
    }

    public abstract float calculatePrice();
}
