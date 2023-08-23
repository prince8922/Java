/*two class (first class have member function and member variable)
second have a main mathod where function calling*/

class Test
{
	int m1,m2; 
	 
	void setData()  // no parameter pass
	{
		m1=22;
		m2=78;
		
	}
	void getData()
	{
		System.out.println("m1="+m1);
		System.out.println("m2="+m2);  // class na variable ne print karva objectnijarurnathi
	}
}

class TestDemo1
{
	public static void main(String args[])
	{
		Test t1d=new Test();
		t1d.setData(); // Access of class Test mathod
		t1d.getData();
	}
}