//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(2,3);
        System.out.println("Area of rectangle is:"+r.area());
        Shape s=r;
        System.out.println("Perimeter of rectangle is:"+s.perimeter());
    }
}