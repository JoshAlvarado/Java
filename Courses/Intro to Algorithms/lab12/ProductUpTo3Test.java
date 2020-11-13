import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProductUpTo3Test {
    @Test
    public void testLength0() {
        assertEquals(ProductUpTo3.productUpToFirst3(new int[]{}), 1);
    }

    // TODO - write your code below this comment.
    // You will need to write at least FOUR tests for the
    // method you wrote in ProductUpTo3.java.  Each test should
    // test a different behavior of this method.
    //
    // If you're not sure you're testing all the
    // behaviors, don't hesitate to ask!
    @Test
    public void testLength2() {
        assertEquals(2,ProductUpTo3.productUpToFirst3(new int[]{2}));
    }
    @Test
    public void testLength4() {
        assertEquals(4,ProductUpTo3.productUpToFirst3(new int[]{2,2,}));
    }
    @Test
    public void testLength8() {
        assertEquals(8,ProductUpTo3.productUpToFirst3(new int[]{2,2,2}));
    }
    @Test
    public void testLength16() {
        assertEquals(16,ProductUpTo3.productUpToFirst3(new int[]{2,2,2,2}));
    }
}