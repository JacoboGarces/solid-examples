package org.example;

public class InterstellarSale extends AbstractSale {
    public InterstellarSale(float amount, float taxes) {
        super(amount, taxes);
    }

    @Override
    public float calculatePrice() {
        return amount * (1 - (taxes + 10)/100);
    }
}
