/*Test.D.1 ma parameter nakhi ne*/
/*two class (first class have member function and member variable)
second have a main mathod where function calling*/

class Test
{
	int m1,m2;
	 
	void setData(int a,int b)   //parameter valu 
	{
		m1=a;
		m2=b;
		
	}
	void getData()
	{
		System.out.println("m1="+m1);
		System.out.println("m2="+m2);  // class na variable ne print karva objectnijarurnathi
	}
}

class TestDemo2
{
	public static void main(String args[])
	{
		Test t1=new Test();
		t1.setData(22,55);
		t1.getData();
		
		Test t2 = new Test();
		t2.setData(23,44);
		t2.getData();
	}
}