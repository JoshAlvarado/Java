import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintEveryOtherLine {
    // TODO - write your code below this comment.
    // Define a method to make this code compile.
    // The method needs to do the following:
    //
    // 1.) Open a given input file.  If the file does not
    //     exist, this should throw a FileNotFoundException.
    //     (Hint: Scanner does this check for you)
    //
    // 2.) Print out every other line of the input file.
    //     The first line of the file should be printed out,
    //     the second line of the file should NOT be printed out,
    //     the third line of the file should be printed out, and
    //     so on.
    //
    // 3.) Close the given input file.
    //
    public static void printEveryOtherLine(File myFile) throws FileNotFoundException {
     Scanner input = null;
     try{
         input = new Scanner(myFile);
         while(input.hasNextLine()) {
           String line = input.nextLine();
           System.out.println(line);
           if (input.hasNextLine()){
               input.nextLine();    
           }    
        }   
    }
    finally {
      if(input != null ) {
        input.close();
    }
  }
}

    // DO NOT MODIFY MAIN!
    public static void main(String[] args)
        throws FileNotFoundException {
        printEveryOtherLine(new File(args[0]));
    }
}