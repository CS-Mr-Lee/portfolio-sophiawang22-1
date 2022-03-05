/** Sophia Wang
    Feb 13
    Description: Write a program that repeatedly asked for the numerator and divisor. For each set of data, 
    the program prints out the result (quotient), or an informative error message if there is a problem 
    (division by zero or poor input data). The program continues looping, even if there is a problem. Exit 
    the loop when data entered for the numerator start with characters “q” or “Q”. Don’t print out an error
    message in this case. Don’t ask for the divisor if the user just asked to quit.
*/

import java.util.Scanner;
public class Wang_Sophia_Foolproof {
   public static void main (String [] args){
   
      Scanner in = new Scanner (System.in);
      //variables
      String numorator = " ";
      String denominator = "";
      
      //as long as first letter of numorator isn't q or Q itll loop
      while (numorator.charAt(0) != 113 && numorator.charAt(0) != 81){
         
         try{
            //numorator input
            System.out.print("Enter a numorator: ");
            numorator = in.next();
            double doubNumorator = Double.parseDouble(numorator);//turns into a double so we can use it for calculations
            
            //will only ask for demoninator if first letter of numorator isn't q or Q
            if (numorator.charAt(0) != 113 && numorator.charAt(0) != 81){ 
               System.out.print("Enter a divisor: ");
               denominator = in.next();
            }
            //casting string inputs into doubles to calculate with
            
            double doubDenominator = Double.parseDouble(denominator);
            if (doubDenominator != 0){
               System.out.println(doubNumorator/doubDenominator);
            }
            //cant divide by 0
            if (doubDenominator == 0){
               System.out.println("you cant divide by 0");
            }
         }
         //if they entered a different data type
         catch (NumberFormatException e){
            if (numorator.charAt(0) != 113 && numorator.charAt(0) != 81){//will only print this message if the first letter of numorator isnt q or Q
               System.out.println("Bad data, please try again");
            }
         }
         
      }   
   }
}





