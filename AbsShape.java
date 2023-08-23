/*imp shape of abstract class */

abstract class Shape
{
	abstract void area();   //Common and this class not have object.
}
class Rectangle extends Shape
{
	void area()
	{
		int s=10;
		System.out.println("area of react="+(s*s));
	}
}
class Circle extends Shape
{
	void area()
	{
		int r=5;
		System.out.println("area of circle="+(3.14*r*r));
	}
}
class Triangle extends Shape
{
	void area()
	{
		int b=5,h=10;
		double area= (b*h/2);
		System.out.println("area of circle="+area);
	}
}

class AbsShape
{
	public static void main(String[] args)
	{
		Rectangle r1=new Rectangle();
		r1.area();
		Circle c1=new Circle();
		c1.area();
		Triangle t1=new Triangle();
		t1.area();
		
	}
}