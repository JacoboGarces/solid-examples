package org.example.interfaceSegregation;

import org.example.Discount;

public class SecondaryDiscount extends Discount {

    @Override
    public float calculate(float total) {
        if (total > 2000) {
            return total - 3000;
        }

        return total;
    }
}
