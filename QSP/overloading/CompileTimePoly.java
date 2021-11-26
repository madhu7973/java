package overloading;

public class CompileTimePoly 
{
	int length;
	int breadth;
	int hieght;
	int radius = 3;
	final double pi = 3.14;
	
	public double area()
	{
		double circle = pi*radius*radius;
		return circle;
		//System.out.println("Area of circle: " + circle);
	}
	
	public double area(int lenght, int breadth)
	{
		double rect = length*breadth; 
		return rect;
		//System.out.println("Area of rextangle: " + rect);
	}
	
	public double area(int lenght, int breadth, int hieght)
	{
		double cone = length*breadth*hieght; 
		return cone;
		//System.out.println("Area of cone: " + cone);
	}
	
	public static void main(String[] args) 
	{
		CompileTimePoly CTP = new CompileTimePoly();
		System.out.println(CTP.area());
		System.out.println(CTP.area(3, 2));
		System.out.println(CTP.area(3, 2, 4));

	}

}