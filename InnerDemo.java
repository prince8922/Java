/*Inner class
Inner class no object only in Outer class ma j bane*/

class Outer
{
	int ox=10;
	class Inner
	{
		void showInner()
		{
			System.out.println("hi ox="+ox);  //outer class ni property direct innerclass ma hale
		}                      
	}
	void showOuter()
	{
		Inner in=new Inner();  //but Inner class ni property outer class ma call karava object banavo pade
		in.showInner();
	}
}
class InnerDemo
{
	public static void main(String args[])
	{
		Outer o1=new Outer();
		o1.showOuter();
	}
}