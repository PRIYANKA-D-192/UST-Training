public class Rectangle {

    public int l;
    public int b;
    public int perimeter(int l,int b)
    {
        this.l=l;
        this.b=b;
        return 2*(l+b);
    }
    public int area(int l,int b)
    {
        this.l=l;
        this.b=b;
        return l*b;
    }
}
