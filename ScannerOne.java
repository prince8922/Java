/*Scanner only for nextInt(); and sum two val*/
import java.util.*;
class ScannerOne
{ 
		
	public static void main(String args[])
	{
		int val1,val2;
		Scanner sc=new Scanner(System.in);    // object intialization
		//set values from user with Scanner class
		
		System.out.println("enter val1=");   //Scanf
		 val1=sc.nextInt();               //printf
		
		System.out.println("enter val2=");
		 val2=sc.nextInt();
			
			int c=val1+val2;
			
			System.out.println("sum of two val="+c);	
	}
}