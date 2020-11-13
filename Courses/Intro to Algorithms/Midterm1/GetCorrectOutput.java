public class GetCorrectOutput {
    // You need to define three methods:
    // 1.) output1: takes an int, adds one to it, and
    //     prints out the result
    // 2.) output2: takes a double, subtracts 1.5 from it,
    //     and prints out the result
    // 3.) output3: takes a String, concatenates "bar" to the
    //     end of it, and prints out the result
    //
    // Your program should end up having the following output:
    //
    // 4
    // 3.0
    // foobar
    // 7
    // 5.5
    // barbar
    //
    // TODO - write your code below this comment
    public static int output1(int num1){
    System.out.println ( num1 + 1 );
    return (num1+1);
    }
    public static double output2(double num1){
    System.out.println ( num1 - 1.5 );
    return (num1-1.5);
    }
    public static String output3(String str1){
    System.out.println ( str1 + "bar" );
    return (str1 + "bar");
    }
    // DO NOT MODIFY main!
    public static void main(String[] args) {
        output1(3);
        output2(4.5);
        output3("foo");

        output1(6);
        output2(7.0);
        output3("bar");
    }
}
