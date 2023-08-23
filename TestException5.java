/*try....catch()in mathod*/

class Test1
{
	int a,b;
	Test1(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void divide()
	{
		try
		{
			int ans=a/b;
			System.out.println("ans=="+ans);
		}
		catch(ArithmeticException e)
		{
			System.out.println("do not enter 0="+e);
		}
	}
	
}
class TestException5
{
	public static void main(String args[])
	{
		Test1 t1=new Test1(20,0);
		t1.divide();
		/*try
		{
			t1.divide();
		}
		catch(ArithmeticException e)
		{
			//System.out.println("do not enter 0"+e);
		}*/
	}
}