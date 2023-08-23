/*Enumaration List and Vector*/
import java.util.Enumeration;
import java.util.Vector;
public class VectorDemo
 {
	 public static void main(String args[])
	 {
		Enumeration List;
		Vector v=new Vector();
		v.add("One1");
		v.add("One2");
		v.add("One3");
		v.add("One4");
		v.add("One5");
		List=v.elements();
		while(List.hasMoreElements())
		{
			System.out.println(List.nextElement());
		}
		System.out.println("Capicity="+v.capacity());  //10
		System.out.println("elementAt 0index="+v.elementAt(0));
		System.out.println("first element in vector="+v.firstElement());
		System.out.println("last element in vector="+v.lastElement());
		System.out.println("vector is Empty??="+v.isEmpty());
		System.out.println("element remove on 4 Index="+v.remove(4));
		System.out.println("Vector size="+v.size()); //last index=4
		v.addElement("Prince");
		System.out.println("Vector size1="+v.size());//5
		System.out.println("last Element="+v.lastElement());
		v.removeAllElements();
		System.out.println("Vector size2="+v.size()); //0 after all remove
	 }
 }