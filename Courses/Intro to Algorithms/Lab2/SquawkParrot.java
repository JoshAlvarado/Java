import java.util.Scanner;

public class SquawkParrot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter something to repeat: ");
        String word = in.nextLine(); // TODO - put your code here
        System.out.println("BRAAWK " + word + "!");
    }
}
