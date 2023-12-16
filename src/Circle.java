public class Circle extends Shape {
    private double rasdius;
    private final double PI =3.14159;
    public Circle(double rasdius){
        this.rasdius=rasdius;
    }

    public double getRasdius() {
        return rasdius;
    }
    public double getPI() {
        return PI;
    }

    @Override
    public double perimeter() {
        //Perimeter of circle=2*pi*r
        double perimeter= 2*PI*this.rasdius;
        return perimeter;
    }

    @Override
    public double area() {
        //Area = PI. r2
        double area=PI*(this.rasdius*this.rasdius);
        return area;
    }
}
