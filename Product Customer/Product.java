public class Product {
    private String itemNo;
    private String name;
    private double price;
    private int qty;

    //getters---------------------------
    public String getitemNo()
    {
        return itemNo;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public int getQty()
    {
        return qty;
    }

    //setters-----------------------------
    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQty(int qty)
    {
        this.qty=qty;
    }

    //Constructors--------------------------
    Product(String itemNo)
    {
        this.itemNo=itemNo;
    }
    Product(String itemNo, String name)
    {
        this.itemNo=itemNo;
        this.name=name;
    }
    Product(String itemNo, String name, double price)
    {
        this.itemNo=itemNo;
        this.name=name;
        this.price=price;
    }
    Product(String itemNo,String name,double price,int qty)
    {
        this.itemNo=itemNo;
        this.name=name;
        this.price=price;
        this.qty=qty;
    }


}
