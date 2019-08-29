package com.tw.vapasi;

import java.util.Objects;

// Models a chance of an event occurring
class Probability {
    private double probability;

    Probability(double probability) {
        this.probability = probability;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Probability other = (Probability) obj;
        return Double.compare(other.probability, probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(probability);
    }
}
