public class StringExplode {
    // TODO - write your code below this comment.
    // You will need to write a method that takes a string and
    // returns an array of the characters in that String.
    //
    // You may (and will need) to use the charAt and length
    // methods of String.  You may NOT use any other methods
    // of String.
    //
   public static char[] explode(String str)  {
        char[] arr = new char[str.length()];
        for(int i = 0; i < str.length(); i++) {
           arr[i] = str.charAt(i);          
        }
       return arr; 
     }
     
    // DO NOT MODIFY printArray!
    public static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        char[] exploded = explode(args[0]);
        printArray(exploded);
    }
}