/*Understandig of static keyword
static ma object ni place per in another class(class.mathod) call thay
sem class ma direct call.

Static ma static j vapray means static mathod ma must be static variable hoy */
class TestStatic
{
	static int a=33;
	static int b=22;
	int c=44;
	
	static
	{
		System.out.println("hello in static");
		b=b*4;
	}
	
	static void add()
	{
		//System.out.println("b="+b); //b=22
		System.out.println("b="+b); // b*4=22*4=88;
		System.out.println("sum="+(a+b));  // 88+33=121;
		//System.out.println("static ma non static var="+c);  
		
		//System.out.println("c="+c); // can't access non static var. in static mathod
		// getData(); non static mathod can't be call inside static method
	}
	void getData()
	{
		System.out.println("a="+a); // non Static mathod ma Static var.. valid thse
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
	
}
class StaticEx1
{
	public static void main(String args[])
	{
		TestStatic.add();  // access of static by class
		
		TestStatic ts=new TestStatic();
		ts.getData();
	//	TestStatic.getData(); // not access because of not static 
		
	}
	
}