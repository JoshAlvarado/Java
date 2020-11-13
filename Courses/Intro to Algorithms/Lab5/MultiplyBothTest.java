import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MultiplyBothTest {
    @Test
    public void zeroTimesOneIsZero() {
        assertEquals(0, MultiplyBoth.multiplyBoth(0, 1));
    }

    @Test
    public void oneTimesOneIsOne() {
        // The code should call the MultiplyBoth.multiplyBoth
        // method with the parameters 1 and 1, and then
        // use assertEquals to ensure that the
        // result is 1.
        // TODO - write your code below this comment.
        assertEquals(1, MultiplyBoth.multiplyBoth(1, 1));
    }

    @Test
    public void twoTimesOneIsTwo() {
        // The code should call the MultiplyBoth.multiplyBoth
        // method with the parameters 2 and 1, and then
        // use assertEquals to ensure that the
        // result is 2.
        // TODO - write your code below this comment.
        assertEquals(2, MultiplyBoth.multiplyBoth(2, 1));
    }
    
    @Test
    public void twoTimesFourIsEight() {
        // The code should call the MultiplyBoth.multiplyBoth
        // method with the parameters 2 and 4, and then
        // use assertEquals to ensure that the
        // result is 8.
        // TODO - write your code below this comment.
        assertEquals(8, MultiplyBoth.multiplyBoth(2, 4));
    }
}
