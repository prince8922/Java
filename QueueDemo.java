/**/
import java.util.*;
public class QueueDemo
{
	public static void main(String args[])
	{
		Queue<Integer> q=new LinkedList<>();
		for(int i=1;i<=5;i++)
		{
			q.add(i);
			System.out.println(q);
		}
		int removeble=q.remove();// remove head of queue
		System.out.println("removed element head="+removeble);// =>1
		System.out.println(q);
		
		int head =q.peek();//view the head of queue =>2
		System.out.println("head of queue peek="+head);
		
		int size =q.size();
		System.out.println("Size of queue="+size);
		
		
		
	}
}