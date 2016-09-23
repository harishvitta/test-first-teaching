import junit.framework.TestCase;

public class IntroTest extends TestCase
{
    public void testHello()
    {
        Intro x = new Intro();
        assertEquals("Hello", x.sayHello());
    }

    public void testGoodbye()
    {
        Intro x = new Intro();
        assertEquals("Goodbye", x.sayGoodbye());
    }


}

