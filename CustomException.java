/*CustomException => always one defult constructer ad thorow 
ex: an application that genrates custom exception if first args from command line is 0.*/

class FirstZeroException extends Exception
{
	FirstZeroException()
	{
		System.out.println("don't enter 0 in first args");
	}
	
}
class CustomException
{
	public static void main(String args[])
	{
		int n1=Integer.parseInt(args[0]);
		try
		{
			if(n1==0)
			{
				throw new FirstZeroException();  // constructer call
			}
			else
			{
				System.out.println("n1="+n1);
			}
		}
		catch(FirstZeroException e)
		{
			System.out.println("hi catch"+e);
		}
	}
}