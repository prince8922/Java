/*set descendingIterator*/
import java.util.*;
class TreeSetDemo
{
	public static void main(String args[])
	{
		TreeSet<String> set=new TreeSet<String>();
		set.add("Prince");
		set.add("Payal");
		set.add("Prank");
		System.out.println("Traversing elemenyts Through itrator in desending");
		Iterator i=set.descendingIterator(); //Descending order ma print thse
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("Highest value"+set.pollFirst());
		System.out.println("lowest value"+set.pollLast());
	}
}
