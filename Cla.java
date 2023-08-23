/*command line arguments (cla)*/
class Cla 
{
	public static void main(String args[])
	{
		System.out.println("first args"+" "+args[0]);     //to give in run time input
		System.out.println("second args"+" "+args[1]);    //ex:java Cla 0 4 march 2022
		System.out.println("third args"+" "+args[2]);     //          [0] [1] [2]  [3] 
		System.out.println("four args"+" "+args[3]);
		//System.out.println("first args"+args[4]);  //Exception(OutOfBound)not setinputinruntime
	}           											// 0-3 na j i/p aapya hoy in runtime
}