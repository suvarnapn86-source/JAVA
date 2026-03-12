abstract class Franchise {
        public abstract void payment(double amount);
        public void maintainFoodQualityAndSpace(){
            System.out.println("Ensure high-quality food is served");
            System.out.println("Maintain minimum 500 sq.dt.space");
        }
    }
    class Dominos extends Franchise{
        public void payment(double amount){
            System.out.println("Domino's payment processed using POS or onlinr:$" + amount);
        }
    }
    class CornerHouse extends Franchise{
        public void payment(double amount){
            System.out.println("Corner House Payment processed via cash,card or UPI:$"+amount);
        }
    }
    public class FranchiseTest{
        public static void main(String[] args){
            Franchise f1 = new Dominos();
            Franchise f2 = new CornerHouse();
            f1.maintainFoodQualityAndSpace();
            f1.payment(150.0);
            System.out.println();
            f2.maintainFoodQualityAndSpace();
            f2.payment(250.0);

        }
    }