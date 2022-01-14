//***************************************************************************
// Lockable interface
// methods to setKey, lock, unlock, and locked program
//***************************************************************************
public interface Lockable {
    
    //methods
    public void setKey(int key);
    public boolean lock(int key);
    public void unlock(int key);
    public boolean locked();
}
