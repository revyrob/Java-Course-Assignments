
/**
 * Parade.java                      TRU OL COMP 1231
 *
 * @author Kayle Robson
 * @version Version1 10Nov2021
 */

import java.util.*;

public class Parade
{
    //ArrayList with capacity of 4
    private static ArrayList<Clown> parade;
    private int end;//end of parade
    private int front;//front of parade
    int index = 0;
    boolean isFront = true;//true if the clown is infront
    
    //function to iterate through the four clowns
    public Parade()
    {
        front = 0;
        parade = new ArrayList<Clown>();
        //iterate over 4 and announce the first four clowns
        for ( Clown pd : parade )
         System.out.println(pd);
        System.out.println();
        
    }
    
    //remove clown the clown in position 0, the front
    public void removeClown()
    {
        parade.remove(0);
        front--;
    }
    
    //add clown to the end of the parade
    public void addClown(Clown c)
    {
        parade.add(c);
        end++;
    }
    
    //display parade of four clowns
    public void display()
    {
        System.out.println(parade);
    }
    
    //returns if the parade is not empty and gets the name of the clown
    //in position 0 (the front)
    public boolean isFront(Clown c)
    {
        return !parade.isEmpty() && c.equals(parade.get(0));
    } 
    
    
}