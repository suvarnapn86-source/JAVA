class order1 {
    int order_ID;
    String Customer_name;
    String product_name;
    float price;
    int quantity;
    order1(int order_ID,String Customer_name,String product_name,float price,int quantity) {
        this.order_ID = order_ID;
        this.Customer_name = Customer_name;
        this.product_name = product_name;
        this.price = price;
        this.quantity = quantity;
    }
    public float CalculateTotalPrice() {
        return price * quantity;
    }

    public void Orderdetails() {
        System.out.println("the order_ID is:" + order_ID);
        System.out.println("the customer _name is:" + Customer_name);
        System.out.println("the product_name:" + product_name);
        System.out.println("the prize of the product is:" + price);
        System.out.println("the quantity of the product is:" + quantity);
        System.out.println("the total price of order :" +CalculateTotalPrice());
    }
}
public class order{
    public static void main(String[] args){
        order1 o=new order1(1,"s","lamp",500,50);
        o.Orderdetails();


    }
}
