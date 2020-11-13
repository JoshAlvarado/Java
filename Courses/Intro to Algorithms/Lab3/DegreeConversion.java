import java.util.Scanner;

public class DegreeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        // TODO - write your code below this comment
        double c = in.nextDouble();
        double f = (c *1.8) + 32 ;
        System.out.println("Fahrenheit: " + f );
    }
}
