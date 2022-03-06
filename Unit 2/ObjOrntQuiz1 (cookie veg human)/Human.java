/** Names: Sophia Wang
    Date: 02/25/2022 <br>
    Description: This program contains a Human class, with each object having attributes name, weight, energyLevel.
*/

public class Human {
  /*Attributes*/

  /**The name of the human*/
  private String name;

  /**The weight of the human*/
  private double weight;

  /**The energy level of the human, from 0 to 100*/
  private int energyLevel;
  
  /*Constructors*/

  /** Default constructor of Human
  Creates a human with a default blank name with weight and energyLevel being -1
  */
  public Human(){
    this.name = "";
    this.weight = -1;
    this.energyLevel = -1;
  }
  /** Human
    Creates a human given parameters
    @param name -- name of human
    @param weight -- weight in kg
    @param energyLevel -- energy level from 0 - 100 % 
  */
  public Human(String name, double weight, int energyLevel){
    this.name = name;
    this.weight = weight; 
    this.energyLevel = energyLevel;

    /*restriction for energy level between 0 and 100%*/
    if (energyLevel > 100){
      this.energyLevel = 100; 
    }  
    else if (energyLevel < 0){
      this.energyLevel = 0; 
    }
    
  }
    
  /*Methods*/

  /*Accessors*/
  /**Gets name
    @return name of human*/
  public String getName(){
    return this.name;
  }

  /**Gets weight
    @return weight in kilograms*/
  public double getWeight(){
    return this.weight;
  }

  /**Gets energy Levels
    @return energy level percentage*/
  public double getEnergyLevel(){
    return this.energyLevel;
  }

  /**
  For each kilometer run, this method halves the energy level of the human and decreases weight by 0.001kg
  @param km -- the number of kilometers run
  */
  public void run(double km){
    //loses 3% energy per km     
    this.energyLevel = this.energyLevel - (int)km*3;
    
    //Decreases weight by 0.001kg per km
    if ((this.weight - 0.001*km) >= 0){
      this.weight = this.weight - 0.001*km;
    }
    else {
      this.weight = 0;
    } 
  }

  /** sleep
    raises energyLevel by hours of sleep * 10%
    @param hour the number of hours of sleep*/
  public void sleep(int hour){
    if(hour < 0){
      hour = 0;
    }
    this.energyLevel = this.energyLevel + (hour*10);
    if (energyLevel > 100){
      energyLevel = 100;
    }
  }
  /** eat 
    person eats a vegetable and gains the same weight eaten and energy   
    increases by 1% per 15 cal
    @param veg -- name of vegetable being eaten
    @param grams -- weight in grams of vegetable*/
  public void eat(Vegetable veg, double grams){
    if (grams > veg.getWeight()){
      System.out.println("I dont have that much food.");
    }
    else {
      this.weight = this.weight + grams/1000;
      //this.energyLevel = this.energyLevel + (int)Math.floor(veg.getCalories()/15);
      this.energyLevel = this.energyLevel + (int)veg.eaten(grams)/15;
    }
  }
  /** eat
    Human eats a cookie and gains weight and energy
    @param food -- cookie being eaten
    @param grams -- grams of cookie being eaten
  */
  public void eat(Cookie food, double grams){
    if (food.getIsPackaged() == false){
      if (food.getWeight() >= grams){
        this.weight = this.weight + grams/1000;
       // this.energyLevel = this.energyLevel + (int)Math.floor(food.getCalories()/15);
        this.energyLevel = this.energyLevel + (int)(food.eaten(grams)/15);
      }
      //weight of cookie to eat is greater than what you have
      else{
        System.out.println("I dont have that much foodasd");
      }
    }
    else{//cookie is packaged
      System.out.println("I cant eat the bag");
    }
  }

  /**
  Returns all the attributes of the human in a String
  @return all the attributes of the human in a String with each attribute on a new line 
  */
  public String toString(){
    String attributes = ("name: " + this.name + "\n" + "weight: " + this.weight + " kg\n" + "Energy Level: " + this.energyLevel + "%");
    return attributes;
  }
}