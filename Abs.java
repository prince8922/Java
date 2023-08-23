/*Abstract= abs
abstract class no object(Instanciated) na bane
abstract class ne je class ma extends karya hoy te class ma abs class ni abs mathod 
implements karavi pade and jo na karvi hoy to te class ne abstract karvu pade

book ma lakhelu che */

abstract class A
{			int a=10;
	void show()           // abs vagar ni
		{
			System.out.println("a="+a);
		}
	abstract void add();  // abs vadi ma only mehod andar kay nahi
}

class B extends A
{
	void add()   // abs vadi ne ahiya implements karvanu jo na arvu hoy to this class to give abstract
	{
		System.out.println("sum="+(a+18));
	}
}
class C extends A
{
	void display()
	{
		System.out.println("hi C");
	}
	void add()  //implements of A abstract mathod
	{
		System.out.println("A iMple in C");
	}
}

class Abs 
{
	public static void main(String args[])
	{
		B b1= new B();
		//b1.show();  // show mathod of class A becuse of extends 
		b1.add(); 
		
		C c1 = new C();
		c1.display();
		c1.show();
		c1.add();
		
	}
}