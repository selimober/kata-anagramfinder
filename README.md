# AnagramFinder

This is an implemention of a code kata aiming to find anagrams in a given list of words.

## What is an Anagram

From [Wikipedia](https://en.wikipedia.org/wiki/Anagram), an __anagram__ is a type of *word play*, the result of
rearranging the letters of a word or phrase to produce a new word or phrase, using all the original letters exactly once;
for example orchestra can be rearranged into carthorse.
Someone who creates anagrams may be called an "anagrammatist".The original word or phrase is known as the *subject* of the anagram.

## They are the same if you sort their letters

This implementation is built on the idea that if two words form an anagram then when you order its characters,
the results should be identical.

 Examples:

     east -> aest
     seat -> aest
     teas -> aest

## Implementation

The basic idea is to keep a `Map<String, List<String>>` where keys are sorted letters of the words
and the value (`List<String>`) is a list of words for this key. For the example above, an entry of the map would be:

    aest -> east, seat, teas

## Usage

    //Get a list of words
    List<Word> wordList = ...; // You can use WordImporter to import Words from a file

    AnagramList anagramList = new AnagramList(wordList);

    anagramList.getValues; // a List<List<String>> for every anagram in the original list

## Known limitations

* Works with english words.