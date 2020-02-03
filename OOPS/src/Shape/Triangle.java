package Shape;


public class Triangle extends Shape implements Info{
	public double side1,side2,side3;
	public Triangle(String backgroundcolor,double thickness,double side1,double side2,double side3)
	{
		super(backgroundcolor,thickness);
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	@Override
	public double getArea()
	{
		double s=side1+side2+side3/2;
		return(Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
	}
	@Override
	public double getPerimeter()
	{
		return(side1+side2+side3);
	}
	@Override
	public void display(String s) {
		System.out.println(s);
	}
	@Override
	public void display(int n) {
		System.out.print(n+":");
	}
}
