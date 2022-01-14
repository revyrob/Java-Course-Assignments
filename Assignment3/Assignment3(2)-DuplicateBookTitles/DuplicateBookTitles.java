import java.io.*;

  
public class DuplicateBookTitles extends Exception
{
    public static void main(String[] args) throws IOException 
    {
        //write output to duplicateTitles
        String writerFileName = "duplicateTitles.out";
        PrintWriter writer = new PrintWriter(writerFileName);
        
        //duplicate of titles to compare
        String compareFileName = "compareTitles.out";
        PrintWriter compare = new PrintWriter(compareFileName);
              
        // BufferedReader object for input.txt
        String readerFileName = "C:\\Users\\Robson\\Desktop\\BCS\\COMP1231"
        +"\\Chpt10\\Assignment3(2)\\bookTitles.inp";
        BufferedReader in = new BufferedReader
        (new FileReader(readerFileName));
          
        String title = in.readLine(); //string for each line with title
        
        //----------------------------------------------------------------
        //while loop that loops through every title in the input file and 
        //stores in compare file until the end of the file
        //----------------------------------------------------------------
        while(title != null)  
        {
            boolean hasDuplicate = false;//boolean to flag duplicate
            
            // BufferedReader object for output.txt, makes copy to compare 
            BufferedReader in2 = new BufferedReader(new FileReader("compareTitles.out"));
              
            String title2 = in2.readLine(); 
        
            try
            {
            //-------------------------------------------------------------
            //while loop that compares duplicateTitle.out to compareTitles
            //loops until the end of the file finds duplicates and puts
            //the duplicates in the duplicateTitle.out
            //------------------------------------------------------------
            while(title2 != null) 
            {
                if(title.equals(title2))
                {
                    hasDuplicate = true; //duplicate 
                    boolean isAlreadyRecorded = false;
                    BufferedReader duplicateFileReader = new BufferedReader(new FileReader
                    (writerFileName));
                    String currentDuplicateTitle = duplicateFileReader.readLine();
                    
                
                    //------------------------------------------------------
                    //records one duplicate title in the duplicateTitle
                    //file
                    //-----------------------------------------------------
                    while(currentDuplicateTitle != null)
                    {
                        if(currentDuplicateTitle.equals(title))
                        {
                            isAlreadyRecorded = true;
                        }
                        currentDuplicateTitle = duplicateFileReader.readLine();
                    }
                
                    if(!isAlreadyRecorded)
                    {
                        writer.println(title);
                        writer.flush();
                    } 
                } 
                  title2 = in2.readLine(); 
                }
                //if a does not have duplicate, it writes the title to 
                //output compare file
                if(!hasDuplicate){
                    compare.println(title);
                    // flushing is important here, makes sure duplicates are taken
                    //out of the compare document
                    compare.flush();
                } 
            
                title = in.readLine();//part of the first while loop
            }
            catch (FileNotFoundException exception)
            {
                System.out.println("file not found, check input file location");
            }
        }
          
        // closing resources
        in.close();
        writer.close();
        
        System.out.println("Output file has been created: " + writerFileName);
        
    }
}