import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CompassTest {
    @Test
    public void test0IsNorth() {
        assertEquals("North", Compass.numberToDirection(0));
    }

    @Test
    public void testOutOfRange8() {
        assertEquals("Out of range: 8",
                     Compass.numberToDirection(8));
    }

    @Test
    public void testSeed123() {
        Compass c = new Compass(123l);
        assertEquals("North",
                     c.randomDirection());
    }

    // TODO - write your code below this comment.
    // You will need to write at least SEVEN tests for
    // your numberToDirection method you wrote in
    // Compass.java.  Each test should test a different
    // behavior of numberToDirection.  While you may
    // tests which are redundant with the tests above,
    // you'll still need to be sure to test each
    // behavior.
    //
    // If you're not sure you're testing all the
    // behaviors, don't hesitate to ask!
    
    
    @Test
    public void testNorth() {
               assertEquals("North",
                     Compass.numberToDirection(0));
    }
    @Test
    public void testNorteast() {
               assertEquals("Northeast",
                     Compass.numberToDirection(1));
    }
    @Test
    public void testEast() {
               assertEquals("East",
                     Compass.numberToDirection(2));
    }
    @Test
    public void testSoutheast() {
               assertEquals("Southeast",
                     Compass.numberToDirection(3));
    }
    @Test
    public void testSouth() {
               assertEquals("South",
                     Compass.numberToDirection(4));
    }
    @Test
    public void testSouthwest() {
               assertEquals("Southwest",
                     Compass.numberToDirection(5));
    }
    @Test
    public void testWest() {
               assertEquals("West",
                     Compass.numberToDirection(6));
    }
     @Test
    public void testNorthweast() {
               assertEquals("Northwest",
                     Compass.numberToDirection(7));
    }
    
    
}
