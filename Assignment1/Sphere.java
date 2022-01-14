//***************************************************************************
// Sphere.java            Java Foundation
//
// Represents a Sphere, the radius, surface area,
// and volume
//****************************************************************************
public class Sphere extends Shape
{    
    //setting up the attributes for sphere
    private final double radius;
    String shape;
    
    //setting radius 
    public Sphere(String shp, double radius)
    {
        shape = shp;
        this.radius = radius;
    }
    
    //creating equation of volume of sphere
    public double volume()
    {
        return (4 * Math.PI * Math.pow(radius, 3))/3;
    }
    
    //creating equation for area for sphere
    public double area()
    {
        return 4 * (Math.PI * Math.pow(radius, 2));
    }
    
    public String toString()
    {
        return "A " + shape + " with a radius of " + radius + ", " + 
        " \na surface area of " + area()
        + "\nand a volume of " + volume() +"\n";
    }
}
