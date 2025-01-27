//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Store s=new Store();
      Customer c1=new Customer("Priyanka");
      Customer c2=new Customer("Kavya");
      s.register(c1);
      s.register(c2);
      s.invite();
    }
}