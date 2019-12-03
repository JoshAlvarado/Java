import java.util.*;
public class Sort{
   public static void main (String[] args){
   
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your first number");
      double num1 = input.nextDouble();
      System.out.println("Enter your second number");
      double num2 = input.nextDouble();
      System.out.println("Enter your third number");
      double num3 = input.nextDouble();

      displaySortedNumbers(num1,num2,num3);
      } public static void displaySortedNumbers(double num1, double num2, double num3){
      
         double temp;
         if (num3 < num2 && num3 < num1){
         
         temp = num1;
         num1 = num3;
         num3 = temp;
         
        } else if (num2 < num1 && num2 < num3){
        
         temp = num1;
         num1 = num2;
         num2 = temp;
         
        } if (num2 > num3){
         temp = num2;
         num2 = num3;
         num3 = temp;
         
         }
         System.out.println(num1+" "+ num2+" "+ num3);   
      }
      }
