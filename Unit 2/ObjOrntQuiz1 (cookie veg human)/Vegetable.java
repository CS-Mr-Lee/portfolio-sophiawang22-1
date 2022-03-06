/**
Sophia Wang
March 1
Vegetable class

name: String
calories: double
weight: double
*/
public class Vegetable {
   /*Attributes*/
   /**Name of the vegetable*/
   private String name;
   /**Calories of the vegetable*/
   private int calories;
   /**Weight of the vegetable in grams*/
   private double weight;
   
  /*Constructors*/
  /** 
  Default Constructor that creates a vegetable and gives it a blank name with weight and calories at -1*/
  public Vegetable(){
    this.name = "";
    this.weight = -1;
    this.calories = -1;
  }
  /** 
    Creates a vegetable from parameters
    @param name -- name of vegetable
    @param weight -- weight in grams
    @param calories -- calories of vegetable
  */
  public Vegetable(String name, double weight, int calories){
    this.name = name;
    this.weight = weight;
    this.calories = calories;
   }
  
  /*Accessors*/

  /**gets name of vegetable
  @return name of vegetable*/
  public String getName(){
    return this.name;
  }
  /**gets number of calories in vegetable
  @return number of calories*/
  public int getCalories(){
    return this.calories;
  }
  /**gets weight of vegetable
  @return weight of vegetable in grams*/
  public double getWeight(){
    return this.weight;
  }

      
  /**eaten
  Vegetable gets eaten
  The amount of vegetable removed is taken as a parameter
  The calories removed is calculated as a percentage of the weight removed
  Returns the amount of calories it gives
  */
  public int eaten (double weight){
    if (weight <= this.getWeight()){
      double percentWeight = weight/this.getWeight();
      int cal = (int)(percentWeight * this.getCalories());
      //changing the weight and calories of whats left of veg
      this.calories = this.calories - cal;
      this.weight = this.weight - weight;
      return cal;
    }
    //more than weight of vegetable was entered
    else {
      return -1;
    }
  }
  /**
  Returns all the attributes of the Vegetable in a String
  @return all the attributes of the Vegetable in a String with each attribute on a new line 
  */
  public String toString(){
    String attributes = ("name: " + this.getName() + "\n" + "weight: " + this.getWeight() + "\n" +  "Calories: " + this.getCalories());
    return attributes;
  }
}