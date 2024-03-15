package org.example;

public class LocalSale extends AbstractSale {

    public LocalSale(float amount, float taxes) {
        super(amount, taxes);
    }

    @Override
    public float calculatePrice() {
        return amount - taxes;
    }
}

