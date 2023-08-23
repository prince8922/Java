/* class and object*/
 class Test1
 {
	 int val=100;
	 int m1,m2;
	 
	 void total()
	 {
		System.out.println("total="+(m1+m2));   //print total
	 }
	 
	public static void main(String args[])
	{
		Test1 t1 = new Test1();
		t1.m1=10;  // call member variable
		t1.m2=22;  
		t1.total();   // call member function

		System.out.println("hello prince your value="+t1.val);  // print val 
	}
 }