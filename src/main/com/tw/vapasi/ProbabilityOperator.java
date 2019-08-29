package com.tw.vapasi;

// models logical operations for probabilities
class ProbabilityOperator {
    Probability andOperation(Probability probabilityOne, Probability probabilityTwo){
        return new Probability(probabilityOne.getProbability() * probabilityTwo.getProbability());
    }
}
