package Shape;


public class Rectangle extends Shape implements Info{
	public double length,breadth;
	public Rectangle(String backgroundcolor,double thickness,double length,double breadth)
	{
		super(backgroundcolor,thickness);
		this.length=length;	
		this.breadth=breadth;
	}
	@Override
	public double getArea()
	{
		return(length*breadth);
	}
	@Override
	public double getPerimeter()
	{
		return(2*(length+breadth));
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
