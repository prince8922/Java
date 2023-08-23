/*CustomException => always one defult constructer
ex: an application that genrates custom exception if first args from command line is 0.
rethrow:*/

class FirstZeroException extends Exception
{
	FirstZeroException()
	{
		System.out.println("don't enter 0 in first args");
	}
	void test(int n) throws FirstZeroException
	{
		try
		{
			if(n==0)
			{
				throw new FirstZeroException(); // 2.constructer call
			}
		}
		catch(FirstZeroException e)
		{
			System.out.println("hi first");
			throw e;
		}
	}
	
}
class CustomException1
{
	public static void main(String args[])
	{
		FirstZeroException fz=new FirstZeroException();  //1.constructer call
		try
		{
			fz.test(Integer.parseInt(args[0])); // test mathod with parameter ne call karavi 
		}
		catch(FirstZeroException e)
		{
			System.out.println("hi second rethrow");
		}
		
	}
}