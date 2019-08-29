package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SuppressWarnings("SimplifiableJUnitAssertion")
class ProbabilityTest {
    @Test
    void expectTrueWhenProbabilityReferencesAreEqual() {
        Probability probabilityOne = new Probability(0.5);
        Probability probabilityOther = probabilityOne;
        assertTrue(probabilityOne.equals(probabilityOther));
    }

    @SuppressWarnings("SimplifiableJUnitAssertion")
    @Test
    void expectFalseWhenProbabilityOtherIsNull() {
        Probability probabilityOne = new Probability(0.5);
        Probability probabilityOther = null;
        assertFalse(probabilityOne.equals(probabilityOther));
    }

    @Test
    void expectFalseWhenProbabilityOtherIsDouble() {
        Probability probabilityOne = new Probability(0.5);
        Double probabilityOther = 0.5;
        assertFalse(probabilityOne.equals(probabilityOther));
    }

    @Test
    void expectTrueWhenProbabilityValuesAreSame() {
        Probability probabilityOne = new Probability(0.4);
        Probability probabilityOther = new Probability(0.4);
        assertTrue(probabilityOne.equals(probabilityOther));
    }

    @Test
    void expectFalseWhenProbabilityValuesAreDifferent() {
        Probability probabilityOne = new Probability(0.4);
        Probability probabilityOther = new Probability(0.7);
        assertFalse(probabilityOne.equals(probabilityOther));
    }

}
