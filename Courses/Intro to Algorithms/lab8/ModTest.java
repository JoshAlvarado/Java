import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ModTest {
    @Test
    public void zeroModOneIsZero() {
        assertEquals(Mod.modBoth(0, 1), 0);
    }

    @Test
    public void oneModOneIsZero() {
        assertEquals(Mod.modBoth(1, 1), 0);
    }

    @Test
    public void twoModOneIsZero() {
         assertEquals(Mod.modBoth(2, 1), 0);
        // TODO - write your code below this comment.
        // The code should call the Mod.modBoth
        // method with the parameters 2 and 1, and
        // then use assertEquals to ensure that
        // the result is 0.
    }

    @Test
    public void twoModTwoIsZero() {
         assertEquals(Mod.modBoth(2, 2), 0);
        // TODO - write your code below this comment.
        // The code should call the Mod.modBoth
        // method with the parameters 2 and 2, and
        // then use assertEquals to ensure that
        // the result is 0.
    }

    @Test
    public void threeModTwoIsOne() {
         assertEquals(Mod.modBoth(3, 2), 1);
        // TODO - write your code below this comment.
        // The code should call the Mod.modBoth
        // method with the parameters 3 and 2, and
        // then use assertEquals to ensure that
        // the result is 1.
    }

    @Test
    public void fiveModTwoIsOne() {
         assertEquals(Mod.modBoth(5, 2), 1);
        // TODO - write your code below this comment.
        // The code should call the Mod.modBoth
        // method with the parameters 5 and 2, and
        // then use assertEquals to ensure that
        // the result is 1.
    }

    @Test
    public void fiveModThreeIsTwo() {
         assertEquals(Mod.modBoth(5, 3), 2);
        // TODO - write your code below this comment.
        // The code should call the Mod.modBoth
        // method with the parameters 5 and 3, and
        // then use assertEquals to ensure that
        // the result is 2.
    }

    @Test
    public void fiveModFourIsOne() {
         assertEquals(Mod.modBoth(5, 4), 1);
        // TODO - write your code below this comment.
        // The code should call the Mod.modBoth
        // method with the parameters 5 and 4, and
        // then use assertEquals to ensure that
        // the result is 1.
    }

    @Test
    public void fiveModFiveIsZero() {
         assertEquals(Mod.modBoth(5, 5), 0);
        // TODO - write your code below this comment.
        // The code should call the Mod.modBoth
        // method with the parameters 5 and 5, and
        // then use assertEquals to ensure that
        // the result is 0.
    }

    @Test
    public void fiveModSixIsFive() {
         assertEquals(Mod.modBoth(5, 6), 5);
        // TODO - write your code below this comment.
        // The code should call the Mod.modBoth
        // method with the parameters 5 and 6, and
        // then use assertEquals to ensure that
        // the result is 5.
    }

    @Test
    public void fiveModSevenIsFive() {
         assertEquals(Mod.modBoth(5, 7), 5);
        // TODO - write your code below this comment.
        // The code should call the Mod.modBoth
        // method with the parameters 5 and 7, and
        // then use assertEquals to ensure that
        // the result is 5.
    }
}