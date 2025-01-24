public class Rectangle extends Shape {
    private double l;
    private double b;
    Rectangle(double l,double b)
    {
        this.l=l;
        this.b=b;
    }
    public double perimeter()
    {
        return (2*(l+b));
    }
    public double area()
    {
        return l*b;
    }


}
