/*add value from cla2 (command line args2)
sum of value in cla */
class ClaTwo
{
	public static void main(String args[])
	{
		int val1= Integer.parseInt(args[0]);     //error like not converted string to int
		int val2=Integer.parseInt(args[1]);  // by using Integer.parseInt
		int sum=val1+val2;
	
		System.out.println("sum="+sum);
	}
}