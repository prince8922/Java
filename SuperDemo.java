/*progaram of super key word*/

class A
{	int  p=10; 

	void display() // ??
	{
		System.out.println("p is in A="+p);  //44
	}
	A()   //Constructor
	{
		System.out.println("hii A");
	}
	A(int x)  //peramter constructor
	{
		p=x;
	}
}
class B extends A
{		int p=20;
		B()
		{
			super(44);  //invoke constructer
		}
		void display()
		{
			System.out.println("p in B="+p);               //20 hoy te aa class ma
			System.out.println("p of A in B="+super.p); //44=> access variable
			super.display();  //invoke the mathod.
		}
		
}

class SuperDemo
{
	public static void main(String args[])
	{
		B b1=new B();
		b1.display(); 
	}
}