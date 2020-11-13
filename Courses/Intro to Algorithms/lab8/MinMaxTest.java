import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MinMaxTest {
    // There are SIX tests in total which you must write.
    // The comments below discuss these, three at a time.
    
    // There are three behaviors of interest for MinMax.min:
    //
    // 1. If the first parameter is smaller than the second, the
    //    first parameter is returned.
    // 2. If the first parameter is equal to the second, either
    //    parameter is returned
    // 3. If the first parameter is greater than the second, the
    //    second parameter is returned.
    //
    // For each of the above behaviors, write a test that makes sure
    // that MinMax.min actually shows the behavior of interest.
    // TODO - write your code below this comment.
   @Test
    public void testFirstSmallerThanSecond() {
        assertEquals(0, MinMax.min(0, 1));
    }
    
    @Test
    public void testBothareEqual() {
        assertEquals(1, MinMax.min(1, 1));
    }
    
    @Test
    public void testtheFirstisGreaterthanSecond() {
        assertEquals(1, MinMax.min(2, 1));
    }



    // There are three behaviors of interest for MinMax.max:
    //
    // 1. If the first parameter is greater than the second, the
    //    first parameter is returned.
    // 2. If the first parameter is equal to the second, either
    //    parameter is returned
    // 3. If the first parameter is less than the second, the
    //    second parameter is returned.
    //
    // For each of the above behaviors, write a test that makes sure
    // that MinMax.max actually shows the behavior of interest.
    // TODO - write your code below this comment.
    @Test
    public void testFirstGreaterThanSecond() {
        assertEquals(2, MinMax.max(2, 1));
    }
    
    @Test
    public void testFirstandSecondEqual() {
        assertEquals(2, MinMax.max(2, 2));
    }
    @Test
    public void testFirstislessthanSecond() {
        assertEquals(2, MinMax.max(1, 2));
    }
}