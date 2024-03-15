package org.example;

public class InternationalSale extends AbstractSale {

    public InternationalSale(float amount, float taxes) {
        super(amount, taxes);
    }

    @Override
    public float calculatePrice() {
        return amount * (1 - taxes/100);
    }
}
