/*Scan karavine in TestD.2 ma
Scanner class and with perameters*/
/*two class (first class have member function and member variable)
second have a main mathod where function calling*/

import java.util.*;
class Test
{
	int m1,m2;
	 
	void setData(int a,int b)
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

class TestDemo3
{
	public static void main(String args[])
	{
		Test t1=new Test();
		
		Scanner sc=new Scanner(System.in);  // to take(set) value from user
		System.out.println("enter first val");
		int p =sc.nextInt();
		
		System.out.println("enter second val");
		int q= sc.nextInt();
		
		t1.setData(p,q);      // p and q must have same( data type) of a,b; 
		t1.getData();
	}
}