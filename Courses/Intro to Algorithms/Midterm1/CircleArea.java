import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        // Your code needs to do the following, in order:
        // 1.) Prompt the user to enter a radius
        // 2.) Read in the radius from the user, as a double
        // 3.) Calculate the area. Use the value 3.14 for pi. 
        // 4.) Print out the area.
        //
        // Correct output is shown below, where 12 was the specific
        // value the user input:
        //
        // Enter radius: 12
        // Area: 452.16
        //
        // Your code needs to match the above output.
        // TODO - write your code below this comment
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double num1 = input.nextDouble();
        double area = 3.14 * Math.pow(num1,2);
        System.out.print("Area: " + area);

        
    }
}
