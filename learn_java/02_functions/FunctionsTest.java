import junit.framework.TestCase;

public class FunctionsTest extends TestCase {

    public void testHello() {
        assertEquals("hello", Functions.hello());
    }

    public void testAdd_NullCase() {
        assertEquals(0, Functions.add(0, 0));
    }

    public void testAdd_TwoPlusTwo() {
        assertEquals(4, Functions.add(2, 2));
    }

    public void testAdd_OnePlusThree() {
        assertEquals(4, Functions.add(1, 3));
    }

    public void testAdd_BiggerNumbers() {
        assertEquals(44, Functions.add(20, 24));
    }

    public void testFtoC_freezing() {
        assertEquals(0, Functions.ftoc(32), 0.001);
    }

    public void testFtoC_boiling() {
        assertEquals(100, Functions.ftoc(212), 0.001);
    }

    public void testFtoC_VeryHot() {
        assertEquals(50, (int) Functions.ftoc(123));
    }

    public void testFtoC_Hot() {
        assertEquals(37, (int) Functions.ftoc(99));
    }

    public void testMakeArray() {
        String[] array = Functions.makeArray("my", "dog", "spot");
        assertEquals("my", array[0]);
        assertEquals("dog", array[1]);
        assertEquals("spot", array[2]);
    }

    public void testSum() {
        int[] numbers = new int[]{1, 2, 3, 4};
        assertEquals(10, Functions.sum(numbers));
    }
}
