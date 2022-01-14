
/**
 * Clown.java                           TRU OL COMP 1231                
 *
 * @author Kayle Robson
 * @version Version1 10Nov2021
 */

import java.util.*;

public class Clown
{
    // name of each clown
    private String name;

    //constructor Name
    public Clown(String name)
    {
        this.name = name;
    }
    
    //Method get Name
    public String getName()
    {
        return name;
    }
    
    //compare one clown to another
    public boolean equals(Object other)
    {
        //the enter name compared to the clown in front
        //prints out compared names
        //prints out true if the name entered is the name infront
        System.out.println("    Compare " + other + " to " + this);
        System.out.println("    isFront: " + name.equals(((Clown)other).name));
        return getName().equals(((Clown)other).getName());
    }
    
    //method to put names into strings
    public String toString()
    {
       return name.toString();
    }
}
