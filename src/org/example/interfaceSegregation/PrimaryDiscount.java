package org.example.interfaceSegregation;

import org.example.Discount;

public class PrimaryDiscount extends Discount {
    @Override
    public float calculate(float total) {
        if (total > 1000) {
            return total - 2000;
        }

        return total;
    }
}
