/*Inner class for static
Inner class no object only in Outer class ma j bane*/

class Outer
{
	int ox=10;
	static int a=100;
	static class Inner
	{
		int is=20;
		void showInner()
		{
			Outer ot=new Outer(); // for non static
			System.out.println("hi ox="+ot.ox+" "+a);  //outer class ni property static  direct static innerclass ma hale
		}                      
	}
	void showOuter()
	{
		Inner in =new Inner();  //but Inner class ni property outer class ma call karava object banavoj pade
		in.showInner();
		System.out.println("is="+in.is);//inner class obj. only in outer class 
	}
}
class InnerDemo1
{
	public static void main(String args[])
	{
		Outer o1=new Outer();
		o1.showOuter();
	}
}