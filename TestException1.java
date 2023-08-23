/*TestExceptyion
only one Try...catch()*/

class TestException1
{
	public static void main(String args[])
	{
		int a,b,ans;
		a=10;
		b=0;
		//ans=a/b;  //ahiya lage exception to ane try ma lesu
		//System.out.println("ans="+ans);
		try
		{
			ans=a/b;
			System.out.println("ans="+ans);
			System.out.println("hi try");
		}
		catch(ArithmeticException e)
		{
			System.out.println("please do not enter 0"+e);
			System.out.println("hi catch");
		}
		System.out.println("hi class");
	}
	
}