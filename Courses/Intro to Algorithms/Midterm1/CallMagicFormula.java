import java.util.Scanner;

public class CallMagicFormula {
    // DO NOT MODIFY magic!
    public static double magic(int a, long b, double c) {
        return a * b + c * b;
    }

    public static void main(String[] args) {
        // Your code needs to do the following in order:
        // 1.) Prompt the user to enter a long
        // 2.) Read in a long from the user
        // 3.) Prompt the user to enter a double
        // 4.) Read in a double from the user
        // 5.) Prompt the user to enter an int
        // 6.) Read in an int from the user
        // 7.) Call the magic method with the aforementioned parameters
        // 8.) Print out the result returned by the magic method.
        //
        // Correct output is shown below, where 1234567890, 32.78,
        // and 55 were all inputs from the user:
        //
        // Enter a long: 1234567890
        // Enter a double: 32.78
        // Enter an integer: 55
        // Magic formula result: 1.0837036938420001E11
        //
        // Your code needs to match the above output.
        // TODO - write your code below this comment
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a long: ");
        long b = input.nextLong();
        System.out.print("Enter a Double: ");
        double c = input.nextDouble();
        System.out.print("Enter a Integer: ");
        int a = input.nextInt();
        System.out.print("Magic Formula Result: " + magic(a,b,c));
        

    }
}
