package Shape;

public class Square extends Shape implements Info{
	public double side;
	public Square(String backgroundcolor,double thickness,double side)
	{
		super(backgroundcolor,thickness);
		this.side=side;	
	}
	@Override
	public double getArea()
	{
		return(side*side);
	}
	@Override
	public double getPerimeter()
	{
		return(4*side);
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

