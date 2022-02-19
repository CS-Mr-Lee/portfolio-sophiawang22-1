/**
Name:Sophia
Date:feb 8 2022
Description:Create a method that returns the smallest angle in a triangle 
in degrees given two sides and an angle in between them. The sides and 
angles can have decimals, and the angle is given in radians.
*/

import java.util.Scanner;//importing scanner

public class Wang_Sophia_SASTriangleSolver {
   public static void main(String[] args) {
   
   //testing
   System.out.println(smallestAngle(1,2,Math.toRadians(60)));
   }
   
   /**
    This method takes the value of two sides of a triangle and the angle between them and returns the smallest angle
    @param side1 - double value of side 1
    @param side2 - double value of side 2
    @param angle1 - double value of the angle between the two sides in radians
    @return - smallest angle
  */
   public static double smallestAngle (double side1, double side2, double angle1){
      double side3 = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2) - 2*(side1*side2*Math.cos(angle1)));
      double angle2 = Math.acos((Math.pow(side1,2) - Math.pow(side2,2) - Math.pow(side3,2))/(-2*side2*side3));
      double angle3 = 180 - angle1 - angle2;
      double min = Math.min(angle3,angle2);
      double finalMin = Math.min(min,angle1);
      return Math.toDegrees(finalMin);
      
   }
}