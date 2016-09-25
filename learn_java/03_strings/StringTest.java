
import java.util.Map;
import junit.framework.TestCase;

public class StringTest extends TestCase
{
    String textRichardIII = "Now is the winter of our discontent, made glorious summer by this son of York.";
    String textRomeo = "O Romeo, Romeo! Wherefore art thou, Romeo? Deny thy father and refuse thy name; Or, if thou wilt not, be but sworn my love, And I'll no longer be a Capulet.";

    Counter counter;

    public void setUp() {
        counter = new Counter();
    }

    public void testCountWords()
    {
        assertEquals(15, counter.countWords(textRichardIII));
        assertEquals(31, counter.countWords(textRomeo));
    }

    public void testCountPhrases()
    {
        assertEquals(2, counter.countPhrases(textRichardIII));
        assertEquals(9, counter.countPhrases(textRomeo));
    }

    public void testCountLetters() throws Exception
    {
        assertEquals(62, counter.countLetters(textRichardIII));
        assertEquals(116, counter.countLetters(textRomeo));
    }

    public void testCountIndividualLetters() throws Exception
    {
        assertEquals(1, counter.countLetters('a', textRichardIII));
        assertEquals(7, counter.countLetters('a', textRomeo));
        assertEquals(16, counter.countLetters('e', textRomeo));
        assertEquals(0, counter.countLetters('z', textRomeo));
    }

    public void testHistogram() throws Exception
    {
        Map histogram = counter.histogram(textRichardIII);
        assertEquals(new Integer(1), histogram.get("a"));
        assertEquals(new Integer(5), histogram.get("e"));
        assertEquals(new Integer(5), histogram.get("i"));
        assertEquals(new Integer(0), histogram.get("z"));
    }
}
