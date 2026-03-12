class flipkartcart
{
    void addItem(String productName, double price,int quantity)
    {
        double total =price * quantity;
        System.out.println("added:"+quantity+"x"+productName+"|Total:$"+total);
    }
    void addItem(String productName,double price,int quantity,boolean republicDayOffer)
    {
        double total=price*quantity;
        double discount=0;
        if(republicDayOffer&&total>50000)
        {
            double dicount = total * 0.10;
        }
        double finalAmount=total-discount;
        System.out.println("Added:"+quantity+"x"+productName+"|Original:$"+total+"|");
        System.out.println("Added:"+quantity+"x"+productName+"|Original:$"+total+"|Discount:$"+discount+"|Final Amount:$");
    }
}
public class flipkartSale_OverLoad
{
    public static void main(String[]  args)
    {
        flipkartcart cart=new flipkartcart();
        cart.addItem("Washing machine",18000,1);
        cart.addItem("iphone",65000,1,true);
        cart.addItem("Headphones",2000,2,true);
    }
}

