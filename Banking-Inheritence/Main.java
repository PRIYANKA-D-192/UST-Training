//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account a=new Account("100","Priyanka","35 velunagar, Salem","0987654321","19.2.2003");
        SavingsAcc s=new SavingsAcc();
        double bal=s.withdrawal(60.0);
        System.out.println("Balance in savings acc after withdrawal of 60 rupees:"+bal);
        LoanAcc l=new LoanAcc(500000,1,6);
        l.payEmi(50000);

    }
}