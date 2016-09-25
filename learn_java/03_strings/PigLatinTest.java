import junit.framework.TestCase;

import java.util.Map;

public class PigLatinTest extends TestCase {

////
//// # Topics
////
//// * modules
//// * strings
////
//// # Pig Latin
////
//// Pig Latin is a made-up children's language that's int}ed to be confusing. It obeys a few simple rules (below) but when it's spoken quickly it's really difficult for non-children (and non-native speakers) to understand.
////
//// Rule 1: If a word begins with a vowel sound, add an "ay" sound to the } of the word.
////
//// Rule 2: If a word begins with a consonant sound, move it to the } of the word, and then add an "ay" sound to the } of the word.
////
//// (There are a few more rules for edge cases, and there are regional variants too, but that should be enough to understand the tests.)
////
//// See <http://en.wikipedia.org/wiki/Pig_latin> for more details.
////

    String s;

    public void testTranslatesAWordBeginningWithAVowel() {
        s = new Text().inPigLatin("apple");
        assertEquals("appleay", s);
    }

    public void testTranslatesAWordBeginningWithAConsonant() {
        s = new Text().inPigLatin("banana");
        assertEquals("ananabay", s);
    }

    public void testTranslatesAWordBeginningWithTwoConsonants() {
        s = new Text().inPigLatin("cherry");
        assertEquals("errychay", s);
    }

    public void testTranslatesTwoWords() {
        s = new Text().inPigLatin("eat pie");
        assertEquals("eatay iepay", s);
    }

    public void testTranslatesAWordBeginningWithThreeConsonants() {
        s = new Text().inPigLatin("three");
        assertEquals("eethray", s);
    }

    public void testCountsSchAsASinglePhoneme() {
        s = new Text().inPigLatin("school");
        assertEquals("oolschay", s);
    }

    public void testCountsQuAsASinglePhoneme() {
        s = new Text().inPigLatin("quiet");
        assertEquals("ietquay", s);
    }

    public void testCountsQuAsAConsonantEvenWhenItsPrecededByAConsonant() {
        s = new Text().inPigLatin("square");
        assertEquals("aresquay", s);
    }

    public void testTranslatesManyWords() {
        s = new Text().inPigLatin("the quick brown fox");
        assertEquals("ethay ickquay ownbray oxfay", s);
    }

    // Test-driving bonus:
    // * write a test asserting that capitalized words are still capitalized (but with a different initial capital letter, of course)
    // * retain the punctuation from the original phrase

}

