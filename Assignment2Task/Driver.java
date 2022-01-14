import java.util.ArrayList;
import java.util.Collections;

public class Driver {
    public static void main(String[] args)
    {
        //tasks listed
        //Task[] tasks = new Task[4];
        ArrayList<Task> ts=new ArrayList<Task>();
        
        ts.add(new Task ("biking", 3 ));
        ts.add(new Task ("school work", 9 ));
        ts.add(new Task ("taxes", 10 ));
        ts.add(new Task ("cooking", 5 ));
        ts.add(new Task ("work", 10));
        ts.add(new Task ("run", 3));
        ts.add(new Task ("get ready for christmas", 4));
        ts.add(new Task ("do nothing", 100 ));
        
        //iterate over tasks and set Priority for each task from the 
        //above information
        //for ( int j=0; j < 4; j++ )
        // System.out.println( tasks[j].setPriority());
        Collections.sort(ts);
        for(Task str:ts) {
            System.out.println("Task: " + str.tasks + "--> Priority: " 
            + str.setPriority());
        }
        
    }
}
