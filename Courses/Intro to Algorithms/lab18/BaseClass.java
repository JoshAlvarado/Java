public class BaseClass {
    // TODO - write your code below this comment.
    // As a hint, this will need to save the String
    // given in the constructor in order to print it
    // out later.
    private String Mystr;
    public BaseClass(String str) {
      Mystr = str;
    }
    public String getstr() {
      return Mystr;
    }
    public void printString() {
      System.out.println(Mystr);
    }
}
