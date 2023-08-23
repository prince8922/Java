/*26 march 2022
program mathod overriding*/

class Test
{	
	void display()
	{
		System.out.println("hi i m Test");
	}
}

class TestDemo extends Test
{
	void display()
	{
		System.out.println("hi i m TestDemo");
	}
}

class OverRide
{
	public static void main(String args[])
	{
		Test t=new Test();
		TestDemo td=new TestDemo();
		td.display();  //je object thi call karo te class ni mehod j call thase=> (mathod overriding/)
		t.display();  // mathod,name and returntype are all same....
	}
}