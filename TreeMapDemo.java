/**/
import java.util.*;
class TreeMapDemo
{
	public static void main(String args[])
	{
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		 tm.put(100,"Garada");
		 tm.put(101,"bhargav");
		 tm.put(102,"rahul");
		 tm.put(103,"kohli");
		 tm.put(110,"ki-ka");
		 
		 for(Map.Entry m:tm.entrySet())
		 {
			 System.out.println(m.getKey()+" "+m.getValue()); //in all map
		 }
	}	
}