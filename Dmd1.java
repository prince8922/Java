/*43 Prince k
11 -04 -2022
Progaram for Dyanamic and Dispatch*/

class A
{
	void show()
	{
		System.out.println("hello A");
	}
}

class B extends A
{
	void show()  //override thay A ni
	{
		System.out.println("Hello B");
	}
}
class Dmd1{
public static void main(String args[])

	{
		A a1= new B(); // b Converted in A  a1=is refrence object of B
		a1.show();    // hello B
		A a2=new A();
		a2.show();
		
 		//B b1=new A();
		//b1.show();  // error=> A can not coverted in B
		
		/*A a2=new A();
		a2.show(); */
		
	}
}

