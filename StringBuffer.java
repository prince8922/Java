/*String Buffer*/
class StringBuffer
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer();
		System.out.println("capacity="+sb.capacity());
		System.out.println("Address="+sb);
		sb.append("hello prince");
		System.out.println("intial string="+sb);
	}
}