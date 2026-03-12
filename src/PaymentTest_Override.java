 class BankPayment {
     public void pay(double amount) {
         System.out.println("Processing generic payment of$" + amount);
     }
 }
 class CreditCardPayment extends BankPayment {
     @Override
     public void pay(double amount) {
         System.out.println("Processing credit card payment of $" + amount);
     }
 }
 class UPIPayment extends BankPayment{
    @Override
     public void pay(double amount){
        System.out.println("Processing UPI payment $"+amount);
     }
 }
 public class PaymentTest_Override {
     public static void main(String[] args) {
         BankPayment payment;
         payment = new CreditCardPayment();
         payment.pay(500.0);
         payment = new UPIPayment();
         payment.pay(250.0);
     }
 }

