public class JavaExample
{
   public static void main(String[] args)

{

    try

    {

     String str = " Hello world 500";


    double dnum = Double.parseDouble(str);


    System.out.print(dnum);

    }

    catch (NumberFormatException exception)

   {

    System.out.println("There is a problem with the entry");

    }
 

}
}