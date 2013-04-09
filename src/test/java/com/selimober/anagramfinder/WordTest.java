package com.selimober.anagramfinder;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * @author : so
 * @since : 4/9/13
 */
public class WordTest {
    @Test
    public void equals_givenTwoAnagrams_returnsTrue() {
        Word w1 = new Word("oyku");
        Word w2 = new Word("koyu");

        assertEquals(w1, w2);
    }

    @Test
    public void sorted_givenAString_returnsSortedChars() {
        Word w1 = new Word("DaBGK");

        assertThat(w1.getSorted(), is("ABDGK"));
    }
}
