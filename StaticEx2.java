/*program for count number of object of class
with static keyword*/

class Test
{
	static int count=0;
	 int a=10; //never can change during Whole program
		Test()
		{
			a=a+20;  //???
			count++;
		}
		void getCount()
		{
			System.out.println("count="+count);
			System.out.println("a="+a);
		}
}
class StaticEx2
{
	public static void main(String args[])
	{
		Test t1=new Test();
		Test t2=new Test();
		//Test t3= new Test();
		t1.getCount();     // object count kare =3
	}
}