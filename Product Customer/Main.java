import java.util.*;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Product p=new Product("101","doll",100.27,30);
            Customer c=new Customer("c1","Rakesh","35, kasthoori flat,Chennai","0987654321");
            System.out.println("Customer ID:"+c.getCustId()+" Customer Name:"+c.getName()+" Customer Address:"+c.getAdd()+" Customer PhNo:"+c.getPhNo());
            System.out.println("Product ID:"+p.getitemNo()+" Product Name:"+p.getName()+" Product Price:"+p.getPrice()+" Product Qty:"+p.getQty());

            //setting new price and phone number
            p.setPrice(120.45);
            c.setPhNo("1234567890");
            System.out.println("After changing product's price and customer's phone number:");
            System.out.println("Customer ID:"+c.getCustId()+" Customer Name:"+c.getName()+" Customer Address:"+c.getAdd()+" Customer PhNo:"+c.getPhNo());
            System.out.println("Product ID:"+p.getitemNo()+" Product Name:"+p.getName()+" Product Price:"+p.getPrice()+" Product Qty:"+p.getQty());


    }
    }
