package com.selimober.anagramfinder;

import org.junit.Test;

import java.io.File;
import java.util.List;

/**
 * @author : so
 * @since : 4/9/13
 */
public class AnagramPrinterTest {
    @Test
    public void testPrinter() throws Exception {

        File file = new File(getClass().getClassLoader().getResource("wordsEn.txt").toURI());
        List<Word> wordList = new WordImporter().importWordListFromFile(file);

        AnagramList anagramList = new AnagramList(wordList);

        new AnagramPrinter().print(anagramList);
    }
}
