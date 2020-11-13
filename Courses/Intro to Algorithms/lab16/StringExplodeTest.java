import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringExplodeTest {
    // TODO - write tests for the method you wrote in StringExplode.java.
    // You should test with strings of length 0, 1, 2, and 3.
  
    @Test
     public void testStringLength0() {
        char[] array = StringExplode.explode("");
        assertEquals(array.length, 0);
        
    }
 
     @Test  
      public void testStringLength1() {
        char[] array = StringExplode.explode("f");
        assertEquals(array.length, 1);
        assertEquals(array[0], 'f');
    }
 
  
    @Test 
    public void testStringLength2() {
        char[] array = StringExplode.explode("fo");
        assertEquals(array.length, 2);
        assertArrayEquals(array, new char []{'f', 'o'});
    }
 
  
     @Test
     public void testStringLength3() {
        char[] array = StringExplode.explode("foo");
        assertEquals(array.length, 3);
        assertArrayEquals(array, new char []{'f', 'o', 'o'});
    }
 
  
}