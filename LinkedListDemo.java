/**/
import java.util.LinkedList;
public class LinkedListDemo
{
	public static void main(String args[])
	{
		LinkedList<String> L1=new LinkedList<>();
		LinkedList<String> L2=new LinkedList<>(); 
		//Object L2=new Object();
		//add elements to LinkedList
		L1.add("A");
		L1.add("B");
		L1.add("C");
		L1.add("D");
		L1.add("E");
		L1.addLast("Me");
		L1.addFirst("GHi");
		L1.add("F");
		System.out.println("Oroginal elements LinkList"+L1);
		
		//L1.remove("D");  //String
		//L1.remove(0); //index
		//System.out.println("Oroginal elements LinkList"+L1);
		L1.removeFirst();
		L1.removeLast();
		System.out.println("Oroginal elements LinkList"+L1);
		
		//set and get value
		Object val=L1.get(1);
		L1.set(1,(String)val+"Changed");
		System.out.println("LinkList after change"+L1);
		
		//L2=L1.clone(); //??
		//System.out.println("LinkList after cloning"+L2);
	}
}