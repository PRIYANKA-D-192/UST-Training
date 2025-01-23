public class SavingsAcc extends Account {
    private double balance=100;
    private double fd=0;
    public double deposit(double amt)
    {
        balance+=amt;
        return balance;
    }
    public double withdrawal(double amt)
    {
        if(balance>amt)
        {
            balance-=amt;
            return balance;
        }
        else
        {
            System.out.println("amount in the account is lesser than the request");
            return 0.0;
        }
    }
    public void fixedDep(double fd)
    {
        this.fd=fd;
    }

}
