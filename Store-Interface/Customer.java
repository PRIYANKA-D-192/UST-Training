public class Customer implements Member {
    String name;
    Customer(String name)
    {
        this.name=name;
    }
    public void callBack()
    {
        System.out.println("I will visit the store,"+name);
    }

}
