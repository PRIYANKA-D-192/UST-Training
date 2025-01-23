public class Account {
    private String accNo;
    private String name;
    private String add;
    private String phNo;
    private String dob;

    //getters----------------------
    public String getAccNo()
    {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }

    public String getPhNo() {
        return phNo;
    }

    public String getDob() {
        return dob;
    }


    //setters--------------------------------------------

    public void setAdd(String add) {
        this.add = add;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    //constructors--------------------------------------
    Account()
    {

    }
    Account(String accNo,String name, String add,String phNo,String dob)
    {
        this.accNo=accNo;
        this.name=name;
        this.add=add;
        this.phNo=phNo;
        this.dob=dob;

    }

}
