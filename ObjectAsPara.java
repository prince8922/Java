/*object as parameters in mathod and sum of two object*/

class Test
{
	int  m1,m2;
	Test()     // consructer have no return
	{
		m1=10;           //   t1 t2 p  q   ans
		m2=20;        // m1   10 11 10 11 =21
		               //m2   20 22 20 22 =42
	}
	Test(int a,int b)  // Parameter consructer
	{
		m1=a;
		m2=b;
	}
	void sum(Test p,Test q)  // two object sum =>as parametres
	{
		m1=p.m1+q.m1;
		m2=p.m2+q.m2;
	}
	void getData()
	{
		System.out.println("m1="+m1);
		System.out.println("m2="+m2);
	}
}

class ObjectAsPara
{
	public static void main(String args[])
	{
		Test t1= new Test();
		Test t2= new Test(11,22);  
		t1.sum(t1,t2);  // type same as p&q  or t1=p, t2=q
		t1.getData();
		
		
	}
}