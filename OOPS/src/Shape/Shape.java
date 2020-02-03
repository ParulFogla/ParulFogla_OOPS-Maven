package Shape;

	public abstract class Shape {
	
		protected String backgroundcolor;
		protected double thickness;
		public Shape(String backgroundcolor,double thickness) {
			this.backgroundcolor=backgroundcolor;
			this.thickness=thickness;
		}
	
		public String getBackground() {
			return backgroundcolor;
		}
		public double getThickness() {
			return thickness;
		}
		public abstract double getArea();
		public abstract double getPerimeter();
}


