/**Sophia Wang
   Testing human cookie and vegetable classes*/

class Wang_Sophia_OOQuiz1 {
  public static void main(String[] args) {
    //1 veg
    Vegetable kale = new Vegetable ("kale", 200.0, 100);
    //1 human
    Human bob = new Human ("bob", 100, 50);
    //3 cookies with different constructors
    Cookie c1 = new Cookie ("c1", 100,500, true);
    Cookie c2 = new Cookie ("c2", 100,500);
    Cookie c3 = new Cookie();
    
    bob.eat(c1,10);//packaged cookie
    bob.eat(kale,300);//more than what you have
    bob.eat(c2, 80);
    System.out.println(bob.toString());
    
  }
}