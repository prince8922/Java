/*TestException
Try...catch() and finally{}*/

class TestException4
{
	public static void main(String args[])
	{
		int a,b,ans;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		//ans=a/b;  //ahiya lage exception to aane try ma lesu
		//System.out.println("ans="+ans);
		try
		{
			ans=a/b;
			System.out.println("ans="+ans);
			System.out.println("hi try");
		}
		//System.out.println("hi error");
		catch(ArithmeticException e)
		{
			System.out.println("please do not enter 0"+e);
			System.out.println("hi catch");
		}
		finally  // always execute =>exception aave k na aave and follows to try block
		{
			System.out.println("hi prince"); // finallt try..catch pa6i j aave
		}
		System.out.println("hi class");
	}
	
}