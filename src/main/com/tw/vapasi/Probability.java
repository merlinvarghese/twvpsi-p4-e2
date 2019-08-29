package com.tw.vapasi;

import java.util.Objects;

// Models a chance of an event occurring
class Probability {
    double value;

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
        return Double.compare(other.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    Probability andOperation(Probability probabilityOther) {
        return new Probability(value * probabilityOther.value);
    }

    Probability notOperation() {
        return new Probability(1 - value);
    }
}

