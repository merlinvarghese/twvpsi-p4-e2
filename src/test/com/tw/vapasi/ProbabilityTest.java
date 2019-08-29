package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ProbabilityTest {
    private final double DELTA = 0.001;

    @Test
    void expectTrueWhenProbabilityReferencesAreEqual() {
        Probability probabilityOne = new Probability(0.5);
        Probability probabilityOther = probabilityOne;
        assertTrue(probabilityOne.equals(probabilityOther));
    }

    @Test
    void expectFalseWhenProbabilityOtherIsNull() {
        Probability probabilityOne = new Probability(0.5);
        assertFalse(probabilityOne.equals(null));
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

    @Test
    void expectZeroPointZeroEightWithAndOfZeroPointFiveAndZeroPointOneSix() {
        Probability probabilityOne = new Probability(0.5);
        Probability probabilityOther = new Probability(0.16);
        assertEquals(0.08, probabilityOne.andOperation(probabilityOther).value, DELTA);
    }

    @Test
    void expectZeroPointTwoWithAndOfZeroPointTwoFiveAndZeroPointEight() {
        Probability probabilityOne = new Probability(0.25);
        Probability probabilityOther = new Probability(0.8);
        assertEquals(0.2, probabilityOne.andOperation(probabilityOther).value, DELTA);
    }

    @Test
    void expectZeroPointFourWithNotOfZeroPointSix() {
        Probability probability = new Probability(0.6);
        assertEquals(0.4, probability.notOperation().value, DELTA);
    }

    @Test
    void expectZeroPointOneWithNotOfZeroPointNine() {
        Probability probability = new Probability(0.9);
        assertEquals(0.1, probability.notOperation().value, DELTA);
    }
}

