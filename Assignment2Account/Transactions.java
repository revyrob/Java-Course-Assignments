//************************************************************
//  Transactions.java          Java Foundations
//
//  Demonstrates the creation and use of multiple Account objects.
//************************************************************
import java.util.Scanner;
import java.lang.String;
public class Transactions
{
   //---------------------------------------------------------
   //  Creates some bank accounts and requests various services.
   //---------------------------------------------------------
   public static void main(String[] args)
   {
    //variable
    int guess;
    String string;
    long account;
    double initial;
    
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
    
    Account myAccount = new Account("Client", 0, 0.0);
    
    if (key != guess) {
        myAccount.locked();
    } else {
      Account acct1 = new Account("Ted Murphy", 72354, 25.59);
      Account acct2 = new Account("Angelica Adams", 69713, 500.00);
      Account acct3 = new Account("Edward Demsey", 93757, 769.32);
      acct1.deposit (44.10); // return value ignored

      double adamsBalance = acct2.deposit (75.25);
      System.out.println("Adams balance after deposit: " +
                         adamsBalance);

      System.out.println("Adams balance after withdrawal: " +
                         acct2.withdraw (480, 1.50));

      acct3.withdraw(-100.00, 1.50); // invalid transaction

      acct1.addInterest();
      acct2.addInterest();
      acct3.addInterest();

      System.out.println();
      System.out.println(acct1);
      System.out.println(acct2);
      System.out.println(acct3);
   }
}
}