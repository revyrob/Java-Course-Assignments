/**
 * ClownParadeTest.java                      TRU OL COMP 1231
 *
 * @author Kayle Robson
 * @version Version1 10Nov2021
 */

import java.util.ArrayList;
import java.util.*;

public class ClownParadeTest 
{
    public static void main(String[] args){
    
    String code;
    
    //list of clown names to pass through Parade
    //includes my name 'Kayle'
    Parade parade = new Parade();
    
    //adding clowns to Parade
    parade.addClown(new Clown("Goofy"));
    parade.addClown(new Clown("Kayle"));
    parade.addClown(new Clown("Bozo"));
    parade.addClown(new Clown("Krusty"));
    
    //scanner to start parade
    Scanner scan = new Scanner(System.in);
    
    //Prints out when the user starts the program
    System.out.print("To start the parade press 'S' ('Q' to stop)");
    
    //scans the input line from the user
    code = scan.nextLine();
    
    //if statement that interprets the input from user
    //if the input does not equal Q for quit the if statement
    //drops to the next input line
    if (!code.equals("Q"))
    {
        //input enters S follow the below
        if (code.equals("S"))
                {
                //display the 4 clowns names that were added ad the beginning
                System.out.println("Here are the first 4 clowns.");
                parade.display();
                
                //user can enter a new name buy pressing N and then add
                //a name they input
                System.out.print("Press 'N' to enter a new clown!");
                code = scan.nextLine();
                }
            
            //if the user enters N the following code enters the new clown
            //and removes the old clown from the collection. it removes the 
            //first clown and adds the new clown to the end of the parade
            while (code.equals("N"))
                {
                //remove a clown from parade
                parade.removeClown();
                
                //add a clown
                System.out.print("Enter a clown name: ");
                code = scan.nextLine();
                parade.addClown(new Clown (code));
                
                //print new clowns
                System.out.println("We have a new clown!");
                parade.display();
                System.out.println("\n");
    
                //the process starts again and the user can enter a 
                //new clown with N or enter F to see which clown is in
                //the front of the parade
                System.out.print("Press 'N' for a new clowns! \n");
                System.out.print("Press 'F' to test isFront method \n");
                code = scan.nextLine();
                
                //if the the user enters F the following code will be 
                //exicuted
                while (code.equals("F"))
                {
                //user enters a clowns name to find out if they are at the 
                //front
                System.out.print("Enter a clown name to find out if it is in front ");
                
                //the entered name is entered as a variable
                Clown target = new Clown (scan.nextLine());
                
                //the new variable is compared with the clown at the front
                //the comparison is done as a boolean
                boolean spot = parade.isFront(target);
                
                //process starts over
                System.out.print("Press 'N' for a new clowns! \n");
                System.out.print("Press 'F' to test isFront method \n");
                code = scan.nextLine();
                } 
                
                } 
            
                //if the user does not equal N and S and Q and F then the
                //program prints out the following line
                if (!code.equals("N") && !code.equals("S") && !code.equals("Q") 
            && !code.equals("F"))
            {
                  System.out.println("Your entry is invalid");  
            }
            
        //prints out when the parade closes
        }  System.out.println("You have stopped the parade!"); 
    }  
    }