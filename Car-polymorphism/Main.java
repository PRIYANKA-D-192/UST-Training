//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      LuxuryCar l=new LuxuryCar();
      l.start();
      l.changeGear();
      l.openRoof();

      Car c=new LuxuryCar();
      c.start();
      c.accelerate();
      c.changeGear();
      //open roof method cannot be accessed as it is not present in parent class Car.
    }
}