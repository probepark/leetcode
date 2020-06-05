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

    @Test
    public void highestScoringWord3() {
        HighestScoringWord highestScoringWord = new HighestScoringWord();
        assertEquals("world", highestScoringWord.highestScoringWord("hello world"));
    }

    @Test
    public void highestScoringWord4() {
        HighestScoringWord highestScoringWord = new HighestScoringWord();
        assertEquals("my", highestScoringWord.highestScoringWord("go ahead make my day"));
    }

    @Test
    public void highestScoringWord5() {
        HighestScoringWord highestScoringWord = new HighestScoringWord();
        assertEquals("there", highestScoringWord.highestScoringWord("there is no place like home"));
    }

    @Test
    public void highestScoringWord6() {
        HighestScoringWord highestScoringWord = new HighestScoringWord();
        assertEquals("aaaaaa", highestScoringWord.highestScoringWord("aaaaaa bbb cc f"));
    }

    @Test
    public void highestScoringWord7() {
        HighestScoringWord highestScoringWord = new HighestScoringWord();
        assertEquals("bbb", highestScoringWord.highestScoringWord("bbb cc f aaaaaa"));
    }
}