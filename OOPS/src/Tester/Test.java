package Tester;
import Shape.*;
import java.util.*;
public class Test{
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int ch=0;
	while(ch!=5)
	{
		System.out.println("_____________________________________________________");
		System.out.println("\t\tMenu");
		System.out.println("\t\t1.Circle");
		System.out.println("\t\t2.Rectangle");
		System.out.println("\t\t3.Square");
		System.out.println("\t\t4.Triangle");
		System.out.println("_____________________________________________________");
		System.out.println("\t\tEnter your choice");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter the thickness of the circle");
			double tc=sc.nextDouble();
			System.out.println("Enter the radius of the circle");
			double radius=sc.nextDouble();
			System.out.println("Enter the background color of the circle");
			String cc=sc.next();
			Circle c=new Circle(cc,tc,radius);
			c.display(1);
			c.display("Circle");
			System.out.println("Thickness is"+c.getThickness());
			System.out.println("BackgroundColor is"+c.getBackground());
			System.out.println("Area is"+c.getArea());
			System.out.println("Perimeter is"+c.getPerimeter());
			break;
		case 2:
			System.out.println("Enter the thickness of the Rectangle");
			double tr=sc.nextDouble();
			System.out.println("Enter the length of the Rectangle");
			double length=sc.nextDouble();
			System.out.println("Enter the breadth of the Rectangle");
			double breadth=sc.nextDouble();
			System.out.println("Enter the background color of the Rectangle");
			String cr=sc.next();
			Rectangle r=new Rectangle(cr,tr,length,breadth);
			r.display(2);
			r.display("Rectangle");
			System.out.println("Thickness is"+r.getThickness());
			System.out.println("BackgroundColor is"+r.getBackground());
			System.out.println("Area is"+r.getArea());
			System.out.println("Perimeter is"+r.getPerimeter());
			break;
		case 3:
			System.out.println("Enter the thickness of the Square");
			double ts=sc.nextDouble();
			System.out.println("Enter the side of the Square");
			double ss=sc.nextDouble();
			System.out.println("Enter the background color of the Square");
			String cs=sc.next();
			Square s=new Square(cs,ts,ss);
			s.display(3);
			s.display("Square");
			System.out.println("Thickness is"+s.getThickness());
			System.out.println("BackgroundColor is"+s.getBackground());
			System.out.println("Area is"+s.getArea());
			System.out.println("Perimeter is"+s.getPerimeter());
			break;
		case 4:
			System.out.println("Enter the thickness of the Triangle");
			double tt=sc.nextDouble();
			System.out.println("Enter the first side of the Triangle");
			double s1=sc.nextDouble();
			System.out.println("Enter the second side of the Triangle");
			double s2=sc.nextDouble();
			System.out.println("Enter the third side of the Triangle");
			double s3=sc.nextDouble();
			System.out.println("Enter the background color of the circle");
			String ct=sc.next();
			Triangle t=new Triangle(ct,tt,s1,s2,s3);
			t.display(4);
			t.display("Triangle");
			System.out.println("Thickness is"+t.getThickness());
			System.out.println("BackgroundColor is"+t.getBackground());
			System.out.println("Area is"+t.getArea());
			System.out.println("Perimeter is"+t.getPerimeter());
			break;
		case 5:
			System.out.println("Thanks");
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		
	}
}
}
