import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        // TODO - write your code below this comment
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principle (long) : ");
        long p = in.nextLong();
        System.out.print("Enter annual interest rate (double) : ");
        double r = in.nextDouble();
        System.out.print("Enter number of times interest is compounded per year (int): ");
        int n = in.nextInt();
        System.out.print("Enter number of years invested (int): ");
        int t = in.nextInt();
        System.out.print(" Compound interest including principal:" + (p*Math.pow(1+(r/n),n*t)));
    }
    
}
