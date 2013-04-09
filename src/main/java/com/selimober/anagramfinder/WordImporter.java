package com.selimober.anagramfinder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : so
 * @since : 4/9/13
 */
public class WordImporter {

    public List<Word> importWordListFromFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));

        List<Word> words = new ArrayList<Word>();
        String line;

        while ((line = br.readLine()) != null) {
            if (!isBlank(line)) {
                words.add(new Word(line));
            }
        }
        br.close();
        return words;
    }

    /**
     * Copied from org.apache.commons.lang.StringUtils
     *
     * @param str
     * @return
     */
    private boolean isBlank(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if ((Character.isWhitespace(str.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }
}
