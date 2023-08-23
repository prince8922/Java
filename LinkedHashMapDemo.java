/**/
import java.util.*;
class LinkedHashMapDemo
{
	public static void main(String args[])
	{
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
		 hm.put(100,"Garada");
		 hm.put(101,"bhargav");
		 hm.put(102,"rahul");
		 
		 for(Map.Entry m:hm.entrySet())
		 {
			 System.out.println(m.getKey()+" "+m.getValue()); //in all map
		 }
	}	
}