/*TestExceptyion
multiple Try...catch()or multiple catch  */

class TestException2
{
	public static void main(String args[])
	{
		int a,b,ans;
		
		//ans=a/b;  //ahiya lage exception
		//System.out.println("ans="+ans);
		try
		{
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			ans=a/b;
			System.out.println("ans="+ans);
			System.out.println("hi try");
		}
		catch(ArithmeticException e)
		{
			System.out.println("please do not enter 0"+e);
			System.out.println("hi catch");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please enter  two value"+e);
		}
		catch(NumberFormatException e)  //only
		{
			System.out.println("please enter value in numberformat"+e);
		}
	}
	
}