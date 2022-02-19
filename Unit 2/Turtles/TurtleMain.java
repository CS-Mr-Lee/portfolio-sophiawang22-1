/**
Name:Sophia
Date:feb 16
Description:turtle
*/

import java.awt.Color;


public class TurtleMain {
   public static void main(String[] a){
      Turtle bob = new Turtle();
      //Look at https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html for different colours
      Turtle.bgcolor("lightblue");
      bob.penColor(new Color(160,75,10));
      bob.width(5);
      bob.forward(40);
      bob.right(90);
      bob.forward(64);
      bob.up();
      bob.forward(34);
      bob.down();
      bob.forward(126);
      bob.right(90);
      bob.forward(150);
      bob.right(90);
      bob.forward(127);
      bob.up();
      bob.forward(3);
      bob.right(90);
      bob.forward(110);
      bob.left(90);
      bob.forward(65);
      bob.down();
      bob.forward(27);
      
      // roof
      bob.up();
      bob.setPosition(-40, 0);
      bob.down();
      bob.right(130);
      bob.forward(150);
      bob.right(140);
      bob.forward(220);
      bob.right(138);
      bob.forward(142);
      bob.fillColor("brown");
      
      //door
      bob.up();
      bob.setPosition(-20, -218);
      bob.width(15);
      bob.setDirection(90);
      bob.down();
      bob.forward(60);
      bob.right(90);
      bob.forward(33);
      bob.right(90);
      bob.forward(60);
      bob.setPosition(-10, -218);
      bob.width(15);
      bob.setDirection(90);
      bob.down();
      bob.forward(60);
      bob.right(90);
      bob.forward(10);
      bob.right(90);
      bob.forward(60);
      
      //window
      bob.up();
      bob.penColor(new Color(250,250,250));
      bob.setPosition(-85, -150);
      bob.setDirection(90);
      bob.down();
      bob.forward(30);
      bob.right(90);
      bob.forward(30);
      bob.right(90);
      bob.forward(30);
      bob.right(90);
      bob.forward(30);
      bob.right(90);
      bob.forward(15);
      bob.right(90);
      bob.forward(30);
      bob.right(90);
      bob.forward(15);
      bob.right(90);
      bob.forward(15);
      bob.right(90);
      bob.forward(30);
      bob.hide();
      bob.up();
      bob.penColor(new Color(0,0,0));
      bob.width(5);
      bob.setPosition(-90, -155);
      bob.setDirection(90);
      bob.down();
      bob.forward(40);
      bob.right(90);
      bob.forward(40);
      bob.right(90);
      bob.forward(40);
      bob.right(90);
      bob.forward(40);
      bob.right(90);
      bob.forward(20);
      bob.right(90);
      bob.forward(40);
      bob.right(90);
      bob.forward(20);
      bob.right(90);
      bob.forward(20);
      bob.right(90);
      bob.forward(40);
      bob.hide();

    
    /*
    What are the attributes for:
      - the position of the turtle -- location
      - the direction of the turtle -- orientation/direction
      - the colour of the pen -- colour
      - if you can see it or not -- hide?
      - it the pen is down or not -- pen up or down
    What are the instructions to:
      - move forward: .forward(distance)
      - turn right/left: .left(angle) or .right(angle)
      - place a dot: .dot
      - place a stamp of the turtle: .stamp()
      - change the colour of the turtle:  .fillColor()
      - change the colour of the turtle's pen: .penColor("colour")
      - lift the pen off the canvas: .up()
      - put the pen onto the canvas: .down()
    
    Can you:
      - draw a house, using colours (first draw the outline, then figure out if you can fill it)

 */
    
  }
}