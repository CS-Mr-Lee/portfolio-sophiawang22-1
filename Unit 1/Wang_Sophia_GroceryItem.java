/**
Name:Sophia
Date:feb 7 2022
Description:Create a program that asks for two grocery items and their price. Print out the text formatted like the following:

---------------------
Grocery #1      $2.99
Grocery #2     $12.98
---------------------

The names of the items will not exceed 20 characters. The price will not exceed $99.99
*/

import java.util.Scanner;//importing scanner

public class Wang_Sophia_GroceryItem {
   public static void main(String[] args) {
   
      //getting item names
      Scanner in = new Scanner(System.in);
      System.out.println("Enter your first grocery item");
      String grocery1 = in.nextLine();
      System.out.println("Enter your second grocery item");
      String grocery2 = in.nextLine();
      
      //getting item prices
      System.out.println("Enter the price of your first grocery item");
      double grocery1Price = in.nextDouble();
      System.out.println("Enter the price of your second grocery item");
      double grocery2Price = in.nextDouble();
     
      //printing it out
      System.out.println("--------------------------");
      //align to left, 20 spaces for names, 4 spaces for price with 2 decimals
      System.out.printf("%-20s$%4.2f\n%-20s$%4.2f",grocery1, grocery1Price, grocery2, grocery2Price);
      System.out.println("\n--------------------------");
   }
}