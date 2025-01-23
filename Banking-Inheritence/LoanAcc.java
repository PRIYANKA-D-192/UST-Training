public class LoanAcc extends Account{
    private double p=0;
    private double r=0;
    private double n=0;

    LoanAcc(double p,double r, double n)
    {
        this.p=p;
        this.n=n;
        this.r=r;
    }
    public void payEmi(double amt)
    {
        if(amt>(0.01*p*n*r))
        {
            amt-=(0.01*p*n*r);
            this.p-=amt;
        }
        System.out.println("After EMI payment , Principle amount is:"+this.p);
    }
    public void topuploan(double p)
    {
        this.p+=p;
    }
    public void repayment(double amt)
    {
        p-=amt;
        r=0;
        n=0;
    }
}
