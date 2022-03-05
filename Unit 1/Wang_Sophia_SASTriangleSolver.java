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
    @return - smallest angle in degrees
  */
   public static double smallestAngle (double side1, double side2, double angle1){
      //finding the third side with cosine law -> a^2=b^2+c^2-2bcCosA
      double side3 = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2) - 2*(side1*side2*Math.cos(angle1)));
      //finding another angle using cosine law and all 3 sides -> cosA=(a^2-b^2-c^2)/-2bc
      double angle2 = Math.acos((Math.pow(side1,2) - Math.pow(side2,2) - Math.pow(side3,2))/(-2*side2*side3));
      //finding the 3rd angle with the value of the other two angles knowing triangle is 180 degrees
      double angle3 = 180 - angle1 - angle2;
      //minimum between 2 angles
      double min = Math.min(angle3,angle2);
      //minimum between earlier minimum and the last angle
      double finalMin = Math.min(min,angle1);
      //return the smallet angle in degrees
      return Math.toDegrees(finalMin);
      
   }
}