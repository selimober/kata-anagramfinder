package com.selimober.anagramfinder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author : so
 * @since : 4/9/13
 */
public class AnagramListTest {
    @Test
    public void getValues_givenWords_returnsOnlyAnagrams() {
        List<Word> wl = new ArrayList<Word>();
        wl.add(new Word("oyku"));
        wl.add(new Word("koyu"));
        wl.add(new Word("zamir"));
        wl.add(new Word("yoku"));

        AnagramList al = new AnagramList(wl);

        List<List<String>> anagrams = al.getValues();

        assertThat(anagrams.size(), is(1));
        assertThat(anagrams.get(0).size(), is(3));
        assertThat(anagrams.get(0).get(0), is("OYKU"));
    }

}
