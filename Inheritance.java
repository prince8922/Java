/*inheritance proprties*/

class A
{
	private int p=222;
	private int q=2223;
	void showData()
	{
		System.out.println("p="+p);
		System.out.println("q="+q);
	}
	void setData(int p,int q)
	{
		this.p=p;
		this.q=q;
	}
}
class B extends A   //inheritance
{   void show()
	{
		showData();
		//System.out.println("p="+p);
		//System.out.println("q="+q);
	}
}
class Inheritance
{	
	public static void main(String args[])
	{
		  B b1=new B();
		  b1.setData(22,33);
		  b1.show();
		  
	}
}