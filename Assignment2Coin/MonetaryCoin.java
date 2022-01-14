//********************************************************************
//  MonetaryCoin.java       Java Foundations
//
//  Solution to Programming Project 8.1 
//********************************************************************

public class MonetaryCoin extends Coin
{
   private int value;

   //-----------------------------------------------------------------
   //  Sets up a coin with a value.
   //-----------------------------------------------------------------
   public MonetaryCoin (int money)
   {
      super();
      value = money;
   }

   //-----------------------------------------------------------------
   //  Sets the value of the coin.
   //-----------------------------------------------------------------
   public void setValue (int money)
   {
      value = money;
   }

   //-----------------------------------------------------------------
   //  Returns the current value of the coin.
   //-----------------------------------------------------------------
   public int getValue ()
   {
      return value;
   }

   //-----------------------------------------------------------------
   //  Returns a description of this coin as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = super.toString();
      result += "\t" + value;
      return result;
   }
}
