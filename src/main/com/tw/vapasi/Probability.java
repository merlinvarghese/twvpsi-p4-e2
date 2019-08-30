package com.tw.vapasi;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

// Models a chance of an event occurring
class Probability {
    private final double value;

    Probability(double probability) {
        this.value = probability;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Probability other = (Probability) obj;
        System.out.println(value + " " + other.value);
        return Double.compare(other.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    Probability andOperation(Probability probabilityOther) {
        return new Probability(formatToNDecimalPlaces(2, value * probabilityOther.value));
    }

    Probability notOperation() {
        return new Probability(formatToNDecimalPlaces(2, 1 - value));
    }

    Probability orOperation(Probability probabilityOther) {
        return new Probability(formatToNDecimalPlaces(2, (value + probabilityOther.value) - andOperation(probabilityOther).value));
    }

    private double formatToNDecimalPlaces(int n, double input) {
        return new BigDecimal(input).setScale(n, RoundingMode.HALF_UP).doubleValue();
    }
}
