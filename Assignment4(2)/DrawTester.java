
/**
 * DrawTest.java            TRU COMP 1231
 * Driver 
 * 
 * @author Kayle Robson
 * @version 1Version    10Nov2021
 */

import java.util.*; 

public class DrawTester
{
    /** two boxes within drawTester
    * box of names (5)
    * box of places at a table (5)
    */
   
    public static void main ( String[] args)
  {
    //variable for the input entered by user
    String code;
    
    //draw the string which represents the name
    Draw<String> myStringBox = new Draw<>();
    
    //draw the integer which represents the seat number
    Draw<Integer> myIntegerBox = new Draw<>();
    
    //scanner to draw when user requests
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Let's draw some names. Press 'd' to draw. ('q' to stop)");
    code = scan.nextLine();
    
    //if code entered from user does not equal q
    if (!code.equals("q"))
    {
        //if code equals d for draw the seat will be drawn with a name
        if (code.equals("d"))
        {
            //the string and int the draw is taken from
            myStringBox = new Draw<>("Kayle", "Benoit", "Teo", "Nova", "Kaleb");
            myIntegerBox = new Draw<>(1, 2, 3, 4, 5);
            for (int index = 0; index < 10 ; index++) {
                String person = myStringBox.drawItem();
                
                int seat = myIntegerBox.drawItem();
                
                System.out.println(String.format("%s will occupy seat %s.",
                person, seat)); 
                
                boolean empty = myIntegerBox.isEmpty();
                //System.out.println("The seat box is empty: " + empty);
                    if (empty == true) {
                        System.out.println("Draw will close because seat box is empty");
                        break;
                    }
                
                System.out.print("Enter 'd' to make a draw. ('q' to stop)");
                code = scan.nextLine();
                    if (code.equals("q")){
                        break;
                    }  
            } 
        } 
        } System.out.println("Thank-you come again");
    } 
}




