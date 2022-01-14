//***************************************************************************
// Cylinder.java            Java Foundation
//
// Represents a Cylinder, the length of it's sides, surface area,
// and volume
//****************************************************************************
public class Cylinder extends Shape
{
    
    //setting up the attributes for cylinder
    private final double radius;
    private final double height;
    String shape;
    
    //setting radius 
    public Cylinder(String shp, double radius, double height)
    {
        shape = shp;
        this.radius = radius;
        this.height = height;
    }
    
    //creating equation for volume for cylinder
    public double volume()
    {
        return Math.PI * (Math.pow(radius, 2)) * height;
    }
    
    //creating formula for area of cylinder
    public double area()
    {
        return (2 * Math.PI * radius) * (height + radius);
    }
    
    public String toString()
    {
        return "A " + shape + " with a height of " + height + " and a" + 
        " radius of " + radius + " \nhas a surface area of " + area()
        + "\nand a volume of " + volume() +"\n";
    }
}
