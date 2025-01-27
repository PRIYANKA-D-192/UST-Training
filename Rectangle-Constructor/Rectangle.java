public class Rectangle {
    public int l;
    public int b;

    Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    public int perimeter()
    {

        return 2*(l+b);
    }
    public int area()
    {

        return l*b;
    }
}
