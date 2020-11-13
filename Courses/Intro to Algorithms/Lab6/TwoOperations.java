import java.util.Scanner;
public class TwoOperations {
    // You must define three static methods:
    //
    // 1.) A method named multDiv, which takes two doubles
    //     (hereafter named `a` and `b`) and returns an instance
    //     of TwoDoubles.  The first instance variable of the
    //     returned TwoDoubles instance must hold the result of
    //     a * b, and the second instance variable of the returned
    //     TwoDoubles instance must hold the result of a / b.
    //
    // 2.) A method named subAdd, which takes two doubles
    //     (hereafter named `a` and `b`) and returns an instance
    //     of TwoDoubles.  The first instance variable of the
    //     returned TwoDoubles instance must hold the result of
    //     a - b, and the second instance variable of the returned
    //     TwoDoubles instance must hold the result of a + b.    
    //
    // 3.) A main method, which will do the following, in order:
    //     1.) Prompt the user with the String: "Enter first double: "
    //     2.) Read in a double from the user, hereafter named `a`
    //     3.) Prompt the user with the String: "Enter second double: "
    //     4.) Read in a double from the user, hereafter named `b`
    //     5.) Call multDiv with `a` and `b`, respectively
    //     6.) Call the printMe method on the TwoDoubles object returned
    //         by multDiv
    //     7.) Call subAdd with `a` and `b`, respectively
    //     8.) Call the printMe method on the TwoDoubles object returned
    //         by subAdd
    //     
    // TODO - write your code below this comment.
    
    public static TwoDoubles multDiv(double a, double b){
      
      return new TwoDoubles(a * b, a / b);
      
      }
    public static TwoDoubles subAdd(double a, double b) {
      return new TwoDoubles(a - b, a + b);
      }
    
    public static void main(String[] args) {
    
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter first double: ");
      double a = input.nextDouble();
      
      System.out.print("Enter second double: ");
      double b = input.nextDouble();
      
      TwoDoubles md = TwoOperations.multDiv(a, b);
      md.printMe();
      
      TwoDoubles sa = TwoOperations.subAdd(a, b);
      sa.printMe();
      }
      
      
}
