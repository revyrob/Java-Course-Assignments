
//*************************************************************************
//IntegerAverage.java      Java Foundations
//
//Enter integers and find average
//Demonstrates the use do a try-catch block
//*************************************************************************

import java.util.Scanner;

public class IntegerAverage
{
    //---------------------------------------------------------------
    //adds and averages integer averages
    //
    //----------------------------------------------------------------
    public static void main(String[] args)
    {
        String code;
        int newNumber = 0;
        double average = 0;
        double sum = 0;
        double count = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter an integer (STOP to quit): ");
        code = scan.nextLine();
        
        while (!code.equals("STOP"))
        {
            try 
            {
                //take string and convert to integer
                newNumber = Integer.parseInt(code);
                sum += newNumber;
                count ++;
                //find average, sum divided by entries 
                average = (sum)/(count);
                System.out.println("The new average is " + average);
            }
            catch (NumberFormatException exception)
            {
                System.out.println(code + " is not a valid integer. ");
            }
            System.out.print("Enter an integer (STOP to quit): ");
            code = scan.nextLine();
        }
        //System.out.println("# of valid codes entered: " + valid);
        //System.out.println("# of banned codes entered: " + banned);
    }
}