package com.tw.vapasi;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

// Models the chance of the occurrence of an event
class Probability {
    private static final double CERTAINTY = 1;
    private static final int PRECISION_TWO = 2;

    private final double value;

    Probability(double probability) {
        this.value = probability;
    }

    Probability andOperation(Probability probabilityOther) {
        return new Probability(value * probabilityOther.value);
    }

    Probability notOperation() {
        return new Probability(CERTAINTY - value);
    }

    Probability orOperation(Probability probabilityOther) {
        return new Probability((value + probabilityOther.value) - andOperation(probabilityOther).value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Probability other = (Probability) obj;
        return Double.compare(formatToNDecimalPlaces(PRECISION_TWO, other.value), formatToNDecimalPlaces(PRECISION_TWO, value)) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    private double formatToNDecimalPlaces(int n, double input) {
        return new BigDecimal(input).setScale(n, RoundingMode.HALF_UP).doubleValue();
    }

}
