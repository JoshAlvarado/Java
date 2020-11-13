import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ScoreDiceTest {
    @Test
    public void testBoth6() {
        assertEquals(10, ScoreDice.scoreWithNumbers(6, 6));
    }
    
    // You must write at least FOUR more tests, one for each unique
    // behavior that scoreWithNumbers can show.  The test above
    // already tests for one of five possible behaviors; you must write
    // tests for the other four.  You may define redundant tests, but
    // you will receive no extra credit for them.
    //
    // If you're not sure you hit all the behaviors of interest, feel
    // free to ask us!
    //
    // TODO - write your code below this comment.
    @Test
    public void testBoth1() {
        assertEquals(10, ScoreDice.scoreWithNumbers(1, 1));

}
    @Test
    public void testBoth2() {
        assertEquals(1, ScoreDice.scoreWithNumbers(1, 2));

}
    @Test
    public void testBoth3() {
        assertEquals(1, ScoreDice.scoreWithNumbers(2, 1));

}
    @Test
    public void testBoth4() {
        assertEquals(8, ScoreDice.scoreWithNumbers(2, 2));

}
}
