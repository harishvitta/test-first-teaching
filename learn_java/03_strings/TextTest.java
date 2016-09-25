
import java.util.Map;
import junit.framework.TestCase;

public class TextTest extends TestCase
{
    String textRichardIII = "Now is the winter of our discontent, made glorious summer by this son of York.";
    String textRomeo = "O Romeo, Romeo! Wherefore art thou, Romeo? Deny thy father and refuse thy name; Or, if thou wilt not, be but sworn my love, And I'll no longer be a Capulet.";

    Text text;

    public void setUp() {
        text = new Text();
    }

    public void testCountWords()
    {
        assertEquals(15, text.countWords(textRichardIII));
        assertEquals(31, text.countWords(textRomeo));
    }

    public void testCountPhrases()
    {
        assertEquals(2, text.countPhrases(textRichardIII));
        assertEquals(9, text.countPhrases(textRomeo));
    }

    public void testCountLetters() throws Exception
    {
        assertEquals(62, text.countLetters(textRichardIII));
        assertEquals(116, text.countLetters(textRomeo));
    }

    public void testCountIndividualLetters() throws Exception
    {
        assertEquals(1, text.countLetters('a', textRichardIII));
        assertEquals(7, text.countLetters('a', textRomeo));
        assertEquals(16, text.countLetters('e', textRomeo));
        assertEquals(0, text.countLetters('z', textRomeo));
    }

    public void testHistogram() throws Exception
    {
        Map histogram = text.histogram(textRichardIII);
        assertEquals(new Integer(1), histogram.get("a"));
        assertEquals(new Integer(5), histogram.get("e"));
        assertEquals(new Integer(5), histogram.get("i"));
        assertEquals(new Integer(0), histogram.get("z"));
    }
}
