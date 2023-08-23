/*calculeter*/

/*Scan karavine in TestD.2 ma
Scanner class*/
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
	
	int sum()                   //sum with returntype
	{
		int i=m1+m2;
		return i;           
	}                                                     // int i ahiya puro.
	int multi()              //multiplication
	{
		int i=m1*m2;
		return i;
	}
	int sub()                           // subtraction
	{
		int i=m1-m2;
		return i;					
	}													// int i ahiya puro.
	double div()               //division    
	{
		double i=m1/m2;      //double i saru
		return i;
	}                                           //double i puro
}

class TestDemo4
{
	public static void main(String args[])
	{
		Test t1=new Test();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first val p=");
		int p =sc.nextInt();
		
		System.out.println("enter second val q=");
		int q= sc.nextInt();
		
		t1.setData(p,q);      // user pase thi p and q must have same( data type) of a,b;
		t1.getData();
		
		/*int ans=t1.sum();
		System.out.println("sum="+ans);    //sum
		ans = t1.multi();
		System.out.println("multi="+ans);   //multi
		ans = t1.sub();
		System.out.println("sub="+ans);    //sub
		double ans1=t1.div();
		System.out.println("div="+ans1); */ //div
	
		int ch,ans;	
		
		do
		{
			System.out.println("enter your choice");
			ch =sc.nextInt();
			switch(ch)
			{
				case 1:
						ans=t1.sum();
						System.out.println("sum="+ans); 
				break;
				case 2:
						ans =t1.multi();
						System.out.println("multi="+ans);
				break;
				case 3:
						ans =t1.sub();
						System.out.println("sub="+ans);
				break;
				case 4:
						double ans1=t1.div();
						System.out.println("div="+ans1); 
				break ;
				default:
						System.out.println("plese enter choice 1 to 4");
						
				
			}
		}while(ch!=5);  //while(ch<5); then loop nay bane ch=6 are not allowed
		}
}