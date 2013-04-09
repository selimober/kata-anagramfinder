package com.selimober.anagramfinder;

import java.util.*;

/**
 * Main entity which keeps an internal map where keys are sorted letters of the words
 * and the value is a list of words for this key.
 *
 * @author : so
 * @since : 4/9/13
 */
public class AnagramList {
    private Map<String, List<String>> list;

    public AnagramList(List<Word> wordList) {
        this.list = new HashMap<String, List<String>>();
        putAll(wordList);
    }

    private void put(Word word) {
        String key = word.getSorted();
        if (list.containsKey(key)) {
            list.get(key).add(word.getSubject());
        } else {
            list.put(key, new ArrayList(Arrays.asList(word.getSubject())));
        }
    }

    public void putAll(List<Word> wordList) {
        for (Word word : wordList) {
            put(word);
        }
    }

    public List<List<String>> getValues() {
        List<List<String>> anagramList = new ArrayList<List<String>>();
        for (Map.Entry<String, List<String>> entry : list.entrySet()) {
            if (entry.getValue().size() > 1) {
                anagramList.add(entry.getValue());
            }
        }
        return anagramList;
    }
}
