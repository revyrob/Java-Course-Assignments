//**************************************************************************
//Driver.java           Java Foundations
//to test 3d shapes
//***************************************************************************
public class Driver
{
    public static void main(String[] args)
    {
        //test cube
        Cube cube = new Cube("cube", 5);
        System.out.println(cube.toString());
        //test cube2
        Cube cube2 = new Cube("cube2", 6);
        System.out.println(cube2.toString());
        
        //test cylinder
        Cylinder cylinder = new Cylinder("cylinder", 2, 5);
        System.out.println(cylinder.toString());
        //test cylinder2
        Cylinder cylinder2 = new Cylinder("cylinder2", 5, 6);
        System.out.println(cylinder2.toString());
        
        //test sphere
        Sphere sphere = new Sphere("sphere", 3);
        System.out.println(sphere.toString());
        //test sphere2
        Sphere sphere2 = new Sphere("sphere2", 4.5);
        System.out.println(sphere2.toString());
    }
}