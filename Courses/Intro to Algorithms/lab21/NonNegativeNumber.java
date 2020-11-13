// Define a class named NonNegativeNumber which inherits
// from NumberValidator.  It should override the
// abstract methods in NumberValidator to do the following:
//
// 1.) For numberValid, it should return true if the
//     input number is greater than, or equal to, 0.
//
// 2.) For numberInvalidMessage, it should return
//     the String "Is negative: NUM", where NUM is
//     the input number.
//

  public class NonNegativeNumber extends NumberValidator{
    public boolean numberValid(int num){
     if( num >= 0 )
     return true; 
     else
     return false; 
  }
      public String numberInvalidMessage(int num){
         return(" Is negative: " + num);
      }
    }
  
  
  
  
  