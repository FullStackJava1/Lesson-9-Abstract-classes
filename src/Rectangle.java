public class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double area() {
        //Area of rectangle=length*width
        return length*width;
    }
    @Override
    public double perimeter() {
        //Perimeter of rectangle=2*(length+width)
     return 2*(length+width);
    }
}
