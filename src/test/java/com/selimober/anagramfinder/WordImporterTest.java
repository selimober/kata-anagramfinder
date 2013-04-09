package com.selimober.anagramfinder;

import junit.framework.Assert;
import org.junit.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * @author : so
 * @since : 4/9/13
 */
public class WordImporterTest {
    @Test
    public void importWordListFromFile_givenFileWithWords_returnsListOfWords() throws Exception {
        WordImporter wi = new WordImporter();
        File wordFile = new File(getClass().getClassLoader().getResource("testWords.txt").toURI());
        List<Word> words = wi.importWordListFromFile(wordFile);

        Assert.assertEquals(words, Arrays.asList(
                new Word("oyku"), new Word("kelam"), new Word("koyu"),
                new Word("melak"), new Word("a"), new Word("fg"),
                new Word("zeban"), new Word("xxx"), new Word("bazen")
        ));
    }
}
