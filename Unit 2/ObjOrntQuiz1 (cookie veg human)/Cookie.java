/**
Sophia Wang
March 1
Cookie class

name: String
calories: double
weight: double
*/
public class Cookie {
  /*Attributes*/
  /**Name of the cookie*/
  private String name;
  /**Calories of the cookie*/
  private int calories;
  /**Weight of the cookie in grams*/
  private double weight;
  /** whether the cookie is packaged or not*/
  private boolean isPackaged;
  
   
  /*Constructors*/
  /**
  Default Constructor to create a cookie that is unpackaged and gives it a blank name with weight and calories at -1*/
  public Cookie(){
    this.name = "";
    this.weight = -1;
    this.calories = -1;
    this.isPackaged = false;
  }

  /**
    default constructor to create a cookie. If packging is unspecified it is unpackaged
    @param name -- name of cookie
    @param weight -- weight in grams
    @param calories -- calories of cookie
  */
  public Cookie(String name, double weight, int calories){
    this.name = name;
    this.weight = weight;
    this.calories = calories;
    this.isPackaged = false;
   }
  /** 
    Creates a cookie with inputed parameters
    @param name -- name of cookie
    @param weight -- weight in grams
    @param calories -- calories of cookie
    @param isPackaged -- true or false if the cookie is packaged
  */
  public Cookie(String name, double weight, int calories, boolean isPackaged){
    this.name = name;
    this.weight = weight;
    this.calories = calories;
    this.isPackaged = isPackaged;
   }
  /*Accessors*/

  /**gets name of cookie
  @return name of cookie*/
  public String getName(){
    return this.name;
  }
  /**gets number of calories in cookie
  @return number of calories*/
  public int getCalories(){
    return this.calories;
  }
  /**gets weight of cookie
  @return weight of cookie in grams*/
  public double getWeight(){
    return this.weight;
  }
  /**gets if cookie is packaged
  @return whether cookie is packaged*/
  public boolean getIsPackaged(){
    return this.isPackaged;
  }

  /**open method
    if the cookie is packged then open it*/
  public void open(){
    this.isPackaged = false;
  }
  
  /**eaten method
    eats the cookie if its unpackaged. this changes the weight and calories of whats left of the cookie and returns the calories of the peice eaten
    @param weight -- amount of weight taken in grams
    @return -- calories eaten
    */
  public int eaten (double weight){
    if(this.isPackaged == false){
      //calculating calories eaten
      if (weight <= this.getWeight()){
        double percentWeight = weight/this.getWeight();
        int cal = (int)(percentWeight * this.getCalories());
        //changing the weight and calories of whats left of cookie
        this.calories = this.calories - cal;
        this.weight = this.weight - weight;
        return cal;
      }
      //more than weight of cookie was entered
      else {
        return -1;
      }
    }
    //cookie in package
    else{
      return -2;
    }
  }
  /**
  Returns all the attributes of the cookie in a String
  @return all the attributes of the cookie in a String with each attribute on a new line 
  */
  public String toString(){
    String attributes = (this.getName() + "\n" + this.getWeight() + "\n" +   this.getCalories() + "\n" + this.getIsPackaged());
    return attributes;
  }
}