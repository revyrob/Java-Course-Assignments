
/**
 * Draw.java                COMP 1231 TRU
 * Generic Draw class 
 *
 * @author Kayle Robson
 * @version 1Version    10Nov2021
 */


import java.util.*;
//not sure if I need to use
//@SuppressWarnings("unchecked")

//stackADT where generic T is substituted for T
//T will be the name and the seat for each draw
public class Draw<T>
{
    boolean isEmpty = true;
    
    Random random = new Random();
    
    List<T> items;
    
    //draw for the first item and then equals the draw
    public Draw(List<T> items) {
        this.items = items;
    }
    
    //
    public Draw(T...items) {
        this(new ArrayList<>(Arrays.asList(items)));
    }
    
    //removes each item until there are 0 in the arraylist
    public T drawItem() {
        if (items.size() > 0) {
            int index = random.nextInt(items.size());
            return items.remove(index);
        } else return null;
    }
    
    //boolean used to determine if the arraylist is empty
    public boolean isEmpty() {
        return items.isEmpty();
    }
    
    //forms and returns a string for each item
    public String toString() {
        return items.toString();
    }
}
    