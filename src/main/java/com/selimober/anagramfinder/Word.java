package com.selimober.anagramfinder;

import java.util.Arrays;

/**
 * A holder to keep both original and sorted form of the word.
 * Equality will be computed on the sorted value.
 * @author : so
 * @since : 4/9/13
 */
public class Word {

    private String subject;

    /**
     * equals and hashCode will be computed according to sorted value
     */
    private String sorted;

    public Word(String subject) {
        this.subject = subject.toUpperCase();
        this.sorted = order(this.subject);
    }

    /**
     * Sorts the letters in a given String.
     * Ex: order("maca") will return "aacm"
     * @param original
     * @return an ordered string
     */
    private String order(String original) {
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    @Override
    public String toString() {
        return "Word{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word = (Word) o;

        return sorted.equals(word.sorted);

    }

    @Override
    public int hashCode() {
        return sorted.hashCode();
    }

    public String getSubject() {
        return subject;
    }

    public String getSorted() {
        return sorted;
    }
}
