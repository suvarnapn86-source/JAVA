interface BankLoan{
    void homeLoan();
    void goldLoan();
}
class HDFC implements BankLoan {
    public void homeLoan() {
        System.out.println("HDFC Home Loan Intrest Rate:7%");
    }

    public void goldLoan() {
        System.out.println("HDFC Gold Lan Intrest Rate:100%");
    }
}
public class BankLoanTest {
    public static void main(String[] args){
        BankLoan hdfc=new HDFC();
        hdfc.homeLoan();
        hdfc.goldLoan();
    }
}
