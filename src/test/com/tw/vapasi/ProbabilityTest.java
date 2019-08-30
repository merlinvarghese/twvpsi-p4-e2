package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {

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
        assertEquals(new Probability(0.08), probabilityOne.andOperation(probabilityOther));
    }

    @Test
    void expectZeroPointTwoWithAndOfZeroPointTwoFiveAndZeroPointEight() {
        Probability probabilityOne = new Probability(0.25);
        Probability probabilityOther = new Probability(0.8);
        assertEquals(new Probability(0.2), probabilityOne.andOperation(probabilityOther));
    }

    @Test
    void expectZeroPointFourWithNotOfZeroPointSix() {
        Probability probability = new Probability(0.6);
        assertEquals(new Probability(0.4), probability.notOperation());
    }

    @Test
    void expectZeroPointOneWithNotOfZeroPointNine() {
        Probability probability = new Probability(0.9);
        assertEquals(new Probability(0.1), probability.notOperation());
    }

    @Test
    void expectZeroPointEightSixWithOrOfZeroPointThreeAndZeroPointEight() {
        Probability probabilityOne = new Probability(0.3);
        Probability probabilityOther = new Probability(0.8);
        assertEquals(new Probability(0.86), probabilityOne.orOperation(probabilityOther));
    }

    @Test
    void expectZeroPointSevenSixWithOrOfZeroPointSevenAndZeroPointTwo() {
        Probability probabilityOne = new Probability(0.7);
        Probability probabilityOther = new Probability(0.2);
        assertEquals(new Probability(0.76), probabilityOne.orOperation(probabilityOther));
    }
}
