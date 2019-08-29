package com.tw.vapasi;

import java.util.Objects;

// Models a chance of an event occurring
class Probability {
    double probability;
    Probability(double probability){
        this.probability = probability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(that.probability, probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(probability);
    }
}
