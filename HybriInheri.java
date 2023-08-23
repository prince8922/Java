/*HybridInheritance  three types =>kene class and interface rakhvu chopda ma che
				A     B
				\     /
				 \   /
				   C
				   |
				   D  */
class A
{
	void showA()
	{
		System.out.println("hii A");
	}
}
interface B
{
	void showB();  //abs and public 
}
class C extends A implements B   // pela Extends pa6i impl..
{
	public void showB()  //implements of B interface mathod showB
	{
		System.out.println("hi B in C");
	}
}

class D extends C 
{
	void show()
	{
		System.out.println("hi D");
	}
}

class HybriInheri
{
	public static void main(String args[])
	{
		D d1=new D();
		d1.show();
		d1.showB();  //because of D extends C and C implements B.
		d1.showA();  //because of C extends A
	}
}