class Task{
    double radius;
    double length;
    double breadth;
    double side;
}
class Square extends Task{
    Square(double side){
        this.side=side;
    }
    public void calculateArea(){
        double area=side*side;
        System.out.println("The area of Square is: "+area);
    }
}
class rectangle extends Task{
    rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void calculateArea(){
        double area=length*breadth;
        System.out.println("The area of rectangle is: "+area);
    }
}
class Circle extends Task{
    Circle(double radius){
        this.radius=radius;
    }
    public void calculateArea(){
        double area=2*Math.PI*radius;
        System.out.println("The area of circle is: "+area);
    }
}
public class shape{
    public static void main(String[] args){
        Square s=new Square(3.1);
        s.calculateArea();
        rectangle r=new rectangle(1.2,6.1);
        r.calculateArea();
        Circle c=new Circle(2.1);
        c.calculateArea();
    }
}