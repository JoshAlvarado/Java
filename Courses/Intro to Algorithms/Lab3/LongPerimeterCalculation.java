import java.util.Scanner;

public class LongPerimeterCalculation {
    public static void main(String[] args) {
        // TODO - write your code below this comment
        Scanner in = new Scanner(System.in);
        System.out.println("What is the width: ");
        long width = in.nextLong();  
        System.out.println("What is the width: ");
        long length = in.nextLong();       
        System.out.println("Perimeter: " + 2*(length+width) );
    }
}
