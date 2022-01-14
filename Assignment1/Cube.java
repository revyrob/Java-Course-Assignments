//***************************************************************************
// Cube.java            Java Foundation
//
// Represents a cube, the length of it's sides, surface area,
// and volume
//****************************************************************************
public class Cube extends Shape
{
    
    //declaring sides
    private final int side;
    String shape;
    
    //constructor
    public Cube(String shp, int sd)
    {
        shape = shp;  side = sd;
    }
    
    //stating cube sides
    public Cube() 
    {
        this(1);
    }
    
    //stating side for cube
    public Cube (int side)
    {
        this.side = side;
    }
    
    //cube volume formula
    public double volume()
    {
        return side * side * side;
    }
    
    //cube area formula
    public double area()
    {
        return 6 * Math.pow(side, 2);
    }
    
    public String toString()
    {
        return "A cube with a side of " + side + " \nhas a surface area of " + area()
        + "\nand a volume of " + volume() +"\n";
    }
}
