import java.util.Scanner;

public class PerimeterCalculation {
    public static void main(String[] args) {
        // TODO: write your code below this comment
        Scanner in = new Scanner(System.in);
        System.out.println("What is the width: ");
        int w = in.nextInt();  
        System.out.println("What is the width: ");
        int l = in.nextInt();       
        System.out.println("Perimeter: " + 2*(l+w) );

    }
}
