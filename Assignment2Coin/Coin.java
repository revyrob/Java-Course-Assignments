//************************************************************************
//Coin class from Chapter 5
//
//Implements Lockable
//***********************************************************************


public class Coin implements Lockable {

  private final int HEADS = 0; // tails is 1
  private int face; // current side showing
  private int key = 666; //key that is entered
  private boolean locked; //boolean locked variable
  
  //------------------------------------------------------------------------
  // Set up this coin by flipping it initially.
  //------------------------------------------------------------------------
  public Coin()
  {
      flip();
      int key = 666;
  }
  
  //------------------------------------------------------------------------
  //Flips this coin by randomly choosing a face value
  //------------------------------------------------------------------------
  public void flip()
  {
      if(!locked) {
      face = (int) (Math.random() * 2);
    }
  }
  
  //----------------------------------------------------------------------
  //Returns true if the current face of this coin is heads
  //----------------------------------------------------------------------
  public boolean isHeads()
  {
      return (face == HEADS);
  }
  
  //----------------------------------------------------------------------
  //Returns teh current face of this coin as a string
  //----------------------------------------------------------------------
  public String toString()
  {
      return (face == HEADS) ? "Heads" : "Tails";
  }
  
  //locked() method from Lockable interface
  @Override
  public boolean locked(){
      return locked;
  }
  
  //setKey() method from Lockable interface
  @Override 
  public void setKey(int key) {
        this.key = key;
  }
  
  //unlock() method from Lockable interface
  @Override
  public void unlock(int key) {
      if(this.key == key) {
          locked = false;
        } 
  }
  
  //boolean lock() method from Lockable interface
  //if this.key != key locked is true
  @Override
  public boolean lock(int key) {
      if(this.key != key) {
          locked = true;
      } return locked();
  }
  
  //public void messageReturn() {
  //    if(locked == false)
  //    System.out.println("unlocked");
  //}
}