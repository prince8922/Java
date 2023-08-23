/**/
import java.util.Stack;
public class StackDemo
{
	public static void main(String aregs[])
	{
		Stack S1=new Stack ();
		S1.push("One");
		S1.push("Two");
		S1.push("Three");
		S1.push("Four");
		S1.push("Five");
		System.out.println("Stack is empty or not:"+S1.empty());
		System.out.println("Peep()="+S1.peek());
		System.out.println("pop()="+S1.pop());
		System.out.println("Size of stack="+S1.size());
	}
}