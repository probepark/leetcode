package com.probeio.friday;

import org.junit.Test;

import static org.junit.Assert.*;

public class HighestScoringWordTest {

    @Test
    public void highestScoringWord() {
        HighestScoringWord highestScoringWord = new HighestScoringWord();
        assertEquals("f", highestScoringWord.highestScoringWord("a b c d e f"));
    }

    @Test
    public void highestScoringWord2() {
        HighestScoringWord highestScoringWord = new HighestScoringWord();
        assertEquals("sentence", highestScoringWord.highestScoringWord("this sentence has two highest scoring words"));
    }
}