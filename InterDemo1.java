/*interface :same as class and pure abstract
all final variable and all abstract mathod(hoyaj bey )
interface ma method hamesha public  hse so bija class ma implements karva te method ne call karvu pade*/

interface A
{    

	//int p; // na hale error aave
	int p=10; //final ver..
	
	void showP(); // abstract and public (in defult)
}

interface B extends A  // 2 interface to extends,interface and class to implements
{
	int q=20;  //final
	
	void showQ();  //abstract and public 
}

class C implements B 
{
	public void showP()    // interface nathi aetle public lakhvu pade in implements vala classma
	{
		System.out.println("hi p in c="+p);
	}
	public void showQ()
	{
		System.out.println("hi Q in C="+q);
	}
	void show()
	{
		System.out.println("hi C");
		showP();
		showQ();
		
	}
}

class InterDemo1
{
	public static void main(String args[])
	{
		B b1=new C(); //refrence b1 by class B 
		b1.showP();
		b1.showQ();// only implements vali call thay by interface B refrence.
	/*or
		C c1=new C();
		c1.show();*/
		//b1.show(); // error=> it's not a implement mathod
	}
}