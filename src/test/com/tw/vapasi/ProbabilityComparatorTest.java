package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class ProbabilityComparatorTest {
    @Test
    void expectTrueWhenProbabilitiesAreEqual()
    {
        Probability probabilityOne = new Probability(0.5);
        Probability probabilityTwo = new Probability(0.5);
        assertEquals(probabilityOne, probabilityTwo);
    }

    @Test
    void expectFalseWhenProbabilitiesAreDifferent()
    {
        Probability probabilityOne = new Probability(0.4);
        Probability probabilityTwo = new Probability(0.7);
        assertNotEquals(probabilityOne, probabilityTwo);
    }
}
