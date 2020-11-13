import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class WriteArgsToFile {
    // TODO - write your code below this comment
    //
    // You need to define a method to make this code compile and do
    // the right thing.  The method you define should write the
    // given command-line arguments to the given file.
    // This method should throw IOException if there is a problem.
    // Additionally, this should ALWAYS close the file, even
    // if there was a problem of some sort.  (Hint: use finally).
    //
    
    public static void writeArgsToFile(String[] a, File x) throws IOException{
          BufferedWriter bw = null;
          try{
             FileWriter fw = new FileWriter(x);
             bw = new BufferedWriter(fw);
             for(int in = 0; in < a.length ; in++) {
               bw.write(a[in]);
               bw.newLine();  
           }
          }  catch(IOException e){
              System.out.println(e.toString());
         }
           finally{
              if ( bw != null){
                   bw.close();
                }  
             } 
          }
           
           
           

    
    // DO NOT MODIFY main!
    public static void main(String[] args)
        throws IOException {
        writeArgsToFile(args, new File("args.txt"));
    }
}