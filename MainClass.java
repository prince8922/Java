/*Main Class
Q=the transport interface decalres a delever().
the abstract class Animal is super class Of Tiger,Camel,Deer and Donkey classes
the Transp[ort interface is implemented by Camel and Donkey classes
Wright a Test Proggram that inistialize array of 4 animal object
if the object implements the transport interface then the delever() invokes*/

interface Transport
{
	void delever();   // public and abstract
}
   abstract class  Animal  //parent class
{
	abstract void delever();  // only abstract
}
class Tiger extends Animal
{
	void delever()
	{
		System.out.println("hi Animal in Tiger");
	}
}
class Camel extends Animal implements Transport
{
	public void delever()
	{
		System.out.println("hi Transport in Camel");
	}
}
class Donkey extends Animal implements Transport
{
	public void delever() 
	{
			System.out.println("hi Transport in Donkey");
	}
}
class Deer extends Animal
{
	void delever()
	{
			System.out.println("hi Animal in Deer");
	}
}
class MainClass
{
	public static void main(String args[])
	{
		Animal a[]=new Animal[4]; // is parent class array
		a[0]=new Tiger();
		a[1]=new Camel();
		a[2]=new Donkey(); //this for uses parent refrence and child object.
		a[3]=new Deer();
		
		/*for(int i=1;i<3;i=i+1)
		{
			a[i].delever();
		}*/
	  if(a[1] instanceof Camel)
		{
			a[1].delever();
		}
		if(a[2] instanceof Donkey)
		{
			a[2].delever();
		}
	}
}