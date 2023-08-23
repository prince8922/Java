/*constructer Type: 1: Default
               2: Perameterrise
		and    3:  copy*/
			   
class Test
{
	int m1,m2;
	Test()       //consructer method with no return type     or 
	{
			m1=30;
			m2=33;           // Default Con setData
	}
	Test(int a,int b)        //Perameterrise Constructer
	{
		m1=a;
		m2=b;            
	}
	Test(Test t)                //CopyConstructer
	{
		m1=t.m1;
		m2=t.m2;
	}
	void getData()
	{
		System.out.println("m1="+m1);
		System.out.println("m2="+" "+m2);

	}
		
}
			   
class ConstructerDemo
{
	public static void main(String args[])
	{
		Test t1=new Test();   // 1: Defaultconsructer called when object are created 
		t1.getData();
		
		Test t2=new Test(55,66);  // 2: peramters Consructer
		t2.getData();
		
		Test t3 =new Test(t2);  //3: copy Constructer t2
		t3.getData();
		
		Test t4=new Test(t1);  //3: same 
		t4.getData();	                           //Error=>T5= lakhu to void can't conv. in Test aave 
	}
}