
public class Task implements Priority, Comparable<Task> {
    //variables
    protected String tasks = "";
    protected Integer priority = 0;
    protected String newPriority = "didn't work";
    
    //set variables
    public Task(String tasks, int priority) {
        this.tasks = tasks;
        this.priority = priority;
    }

    //get task 
    public String getTask() {
        return tasks;
    }
        
    //use from the Priority interface getPriority
    @Override
    public int getPriority() {
        return priority;
    }
    
    
    //use from the Priority interface setPriority
    //if statement to change int priority to newPriority
    @Override
    public String setPriority() {
        if (this.priority <= 3) {
            newPriority = ("LOW");
        } else if (this.priority >= 4 && this.priority <= 7) {
            newPriority = ("MED");
        } else if (this.priority >=8) {
            newPriority = ("HIGH");
        } else {
            newPriority = ("There is no priority set");
        }
        //return "Task: " + tasks + "--> Priority: " + newPriority;
        return newPriority;
    }
    
    @Override
    public int compareTo(Task pr) {
        return this.priority.compareTo(pr.priority);
        
    } 
    
    
       
    } 



