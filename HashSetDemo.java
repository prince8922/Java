/**/
import java.util.*;
public class HashSetDemo
{
	public static void main(String args[])
	{
		HashSet<String> set=new HashSet<String>();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		
		Iterator<String> itr=set.iterator();//Traversing element
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	
}