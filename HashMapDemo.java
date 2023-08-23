/**/
import java.util.*;
class HashMapDemo
{
	public static void main(String args[])
	{
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"MQng0"); //put elements on map
		map.put(2,"Apple");
		map.put(3,"Banana");
		map.put(4,"grapes");
		System.out.println("Iterating HAshMap");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
	
}