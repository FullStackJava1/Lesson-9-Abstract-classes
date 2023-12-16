public class Main {
    /*
       1.Define an abstract class called Shape.
            This class should have two abstract methods:
             area() and perimeter().
             These methods should not have a body and should be declared as public.
       2.Create a subclass of Shape called Circle.
            This class should have a constructor that takes a radius as a parameter.
            It should also implement the area() and perimeter() methods,
            which should return the area and perimeter of the circle, respectively.
       3.Create another subclass of Shape called Rectangle.
            This class should have a constructor that takes the length and width of the rectangle as parameters.
            It should also implement the area() and perimeter() methods,
            which should return the area and perimeter of the rectangle, respectively.
       4.Create a Main class that instantiates objects of both Circle and Rectangle.
           It should call the area() and perimeter() methods on each object and print out the results.
       */
    public static void main(String[] args)
    {
        // Create some shapes, draw, and print their details
        Shape[] shapeList = new Shape[2];
        shapeList[0] = new Rectangle(2.0, 4.0); // Upcasting
        shapeList[1] = new Circle(5.0); // Upcasting
        //Rectangle
        System.out.println("Perimeter of Rectangle: "+shapeList[0].perimeter());
        System.out.println("Area of Rectangle: "+shapeList[0].area());
        //Crcle
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Perimeter of circle: "+shapeList[1].perimeter());
        System.out.println("Area of circle: "+shapeList[1].area());

    }
}