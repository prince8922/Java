/*
Program for Dynamic method Dispatch 2
over ride no j refrence bane */

class A
{
	void show()
	{
		System.out.println("hello A");
	}
}
class B  extends A
{
	void show()
	{
		System.out.println("hello B");
	}
	void display()
	{
		System.out.println("display in B");
	}
}
class C extends A
{
	void show()
	{
		System.out.println("Hello c");
	}
	void print()
	{
		System.out.println("print in C");
	}
}

class Dmd2
{
	public static void main(String args[])
	{
		A r;   // r is refrence A class by use this for	qthod
		A a1=new A();
		B b1=new B();
		C c1=new C();
		
		r=a1;
		r.show(); //hello A
		
		r=b1;  //hello B
		r.show();
		//r.display(); // iy will generate an error.because method display is not override..
		
		r=c1;
		r.show(); //Hello C
		//r.print(); //error not override mathod
		b1.display();
		c1.print();
	}
}