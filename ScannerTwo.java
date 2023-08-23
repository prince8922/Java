/*ScannerTwo to all sc.next(); nextLine(); nextFloat();nextDouble(); nextBoolean();*/

import java.util.*;
class ScannerTwo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);   //user pase thi value leva System.in

		System.out.println("enter fullname=");   //pela nextLine(); valu  pa6i next();
		String fullname=sc.nextLine();         
		
		System.out.println("enter firstname=");     //pela Scanf and printf
		String fn=sc.next();                      //next();=> use in only for one word
		
		System.out.println("enter lastname=");
		String ln =sc.next();
		
		//System.out.println("enter fullname=");
		//String fullname=sc.nextLine();		//nextLine();=>use space beetwen 2 or many word
		 
//     	System.out.println(fn+" "+ln+" "+fullname);
		 
		 /*jo pela next(); ma two word lakhvama aave to 2nd word e buffer ma store thay
		 pa60 te ln ma user value nakhe e pela buffer valu print tahy*/
		 
		 //Scanner sc1=new Scanner(System.in);   //new object for float,boolean and double
		 
		 System.out.println("enter float=");
		 float f=sc.nextFloat();                //33.333
		 
		 System.out.println("enter boolean=");
		 boolean b=sc.nextBoolean();                  //true or false
		 
		 System.out.println("enter double=");
		 double d= sc.nextDouble();                       //23.3
		 
		 System.out.println(f+" "+b+" "+d); // float,boolean,double
		 	System.out.println(fn+" "+ln+" "+fullname); // firstname,lastname,fullname
		
	}
}