/*Arraylist Demo add and remove mathod*/
import java.io.IOException;
import java.util.ArrayList;
public class ArrayListDemo
{
	public static void main(String args[])
	{
		ArrayList l1=new ArrayList();
		l1.add("first");
		l1.add("Second");
		l1.add("Thhird");
		l1.add("four");
		l1.add("five5");
		System.out.println("show All Element which are store in arraylist");
		for(int i=0;i<=4;i++)
		{
			System.out.println(l1.get(i));
		}
		l1.remove(2);  //index
		l1.remove(0); //index
		System.out.println("show data after remove some Element which are store in arraylist");
		for (int i=0;i<=2;i++)
		{
			System.out.println(l1.get(i));
		}
		
	}
}