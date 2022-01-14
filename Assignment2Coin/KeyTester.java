//************************************************************************
//KeyTester
//
//Tests the key entered for Coin
//***********************************************************************

import java.util.Scanner;
public class KeyTester{

  public static void main(String[] args) {
    
    //variable
    int guess;
    
    //scanner for getting key from user
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter key: ");
    
    //user key entered equals int guess
    guess = scan.nextInt();
    
    //remaining code from Coin
    int key = 666;
    
    //test to see what is set
    //the methods from lockable do not work
    System.out.println("key: " + key + "  guess:" + guess);
    
    //remaining code from Coin
    final int flips = 1000;
    int heads = 0, tails = 0;

    Coin myCoin = new Coin();

    for (int  count =1; count <= flips; count++) {
      myCoin.flip();
      if (key != guess) {
          myCoin.locked();
      } else {
          if (myCoin.isHeads())
            heads++;
          else
            tails++;
            }
        }
    System.out.println ("The number flips: " + flips);
    System.out.println ("The number of heads: " + heads);
    System.out.println ("The number of tails: " + tails);
  }
}