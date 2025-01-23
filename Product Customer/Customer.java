public class Customer {
    private String custId;
    private String name;
    private String add;
    private String phNo;

    //getters-------------------------------------
    public String getCustId()
    {
        return custId;
    }
    public String getName()
    {
        return name;
    }
    public String getAdd()
    {
        return add;
    }
    public String getPhNo()
    {
        return phNo;
    }

    //setters------------------------------------
    public void setAdd(String add)
    {
        this.add=add;
    }
    public void setPhNo(String phNo)
    {
        this.phNo=phNo;
    }


    //constructors---------------------------------
    Customer(String custId,String name)
    {
        this.custId=custId;
        this.name=name;
    }
    Customer(String custId,String name,String add)
    {
        this.custId=custId;
        this.name=name;
        this.add=add;
    }
    Customer(String custId,String name,String add,String phNo)
    {
        this.custId=custId;
        this.name=name;
        this.add=add;
        this.phNo=phNo;
    }



}
