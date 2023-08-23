/*Math.ex 
09 march 2022
*/
class MathTest
{
	public static void main(String args[]) //in Mathemathics opp. not  to define object direct
	{

		double a=12.7834748;
		double b=78.18;
		int c=4;                                              
																// badha small 
		System.out.println("enter maxval="+Math.max(12,33));  //direct this (Math.smallcases)
		System.out.println("enter minval="+Math.min(12,33));
		System.out.println("enter sin val="+Math.sin(a));   
		System.out.println("enter sinhyperb val="+Math.sinh(a));   
		System.out.println("enter cos val="+Math.cos(b));   
		System.out.println("enter coshyperb val="+Math.cosh(b));   
		System.out.println("enter absolute val="+Math.abs(-33.33));    //mod (positive)
	   	System.out.println("enter ceiling val="+Math.ceil(b));     // 79  
		System.out.println("enter flooring val="+Math.floor(b));     //=>78.0 
		System.out.println("enter Sqrerootof val="+Math.sqrt(c));   
		System.out.println("enter logarithem val="+Math.log10(2));
		
		System.out.println("enter pi val="+Math.PI);   
	}
}