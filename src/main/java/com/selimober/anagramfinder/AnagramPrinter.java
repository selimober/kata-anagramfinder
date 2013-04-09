package com.selimober.anagramfinder;

import java.util.List;

/**
 * @author : so
 * @since : 4/9/13
 */
public class AnagramPrinter {

    public void print(AnagramList anagramList) {
        for (List<String> anagrams : anagramList.getValues()) {
            StringBuilder sb = new StringBuilder();
            String delim = "";
            for (String anagram : anagrams) {
                sb.append(delim).append(anagram);
                delim = ", ";
            }
            System.out.println(sb);
        }
    }
}
