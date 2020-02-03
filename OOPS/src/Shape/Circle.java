package Shape;

public class Circle extends Shape implements Info{
	@Override
	public void display(String s) {
		System.out.println(s);
	}
	@Override
	public void display(int n) {
		System.out.print(n+":");
	}
	public double radius;
	public Circle(String backgroundcolor,double thickness,double radius)
	{
		super(backgroundcolor,thickness);
		this.radius=radius;	
	}
	@Override
	public double getArea()
	{
		return(Math.PI*radius*radius);
	}
	@Override
	public double getPerimeter()
	{
		return(Math.PI*radius*2);
	}
}
