/*object as parameters and sum of two object
Object as Return type*/

class Test
{
	int  m1,m2;
	Test()     // consructer have no return
	{
		m1=10;           //   t1 t2 t3  p q  t
		m2=20;        // m1   10 11 21 10 11 =21
		               //m2   20 22 42 20 22 =42
	}
	Test(int a,int b)  // parameters consructer
	{
		m1=a;
		m2=b;
	}
	 Test sum(Test p,Test q)   // two object sum as parameters  with return type
	{  Test t=new Test();
		t.m1=p.m1+q.m1;
		t.m2=p.m2+q.m2;
		return t;
	}
	void getData()
	{
		System.out.println("m1="+m1);
		System.out.println("m2="+m2);
	}
}

class ObjectAsReturnT
{
	public static void main(String args[])
	{
		Test t1= new Test();
		Test t2= new Test(11,22);  
		Test t3= new Test();
		t3=t1.sum(t1,t2);  // type same as p&q  and t3 ma store karava
		t3.getData();    // t3 ma store che to t3 ma get karavanu
		
		
	}
}