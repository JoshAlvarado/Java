public class PrintMain {
    public static void main(String[] args) {
        // Your code needs to do two things in order:
        // 1.) Call printString (defined in PrintString.java)
        //     with the actual parameter "bar"
        // 2.) Call printInt (defined in PrintInt.java)
        //     with the actual parameter 98
        // TODO - write your code below this comment.
        
        printString("bar");
        printInt(98);
      
        }
      public static int printInt(int num1){
         System.out.print(num1);
         return num1;
    }
      public static String printString(String str1){
         System.out.println( str1 );
         return str1 ;
   }

  
}