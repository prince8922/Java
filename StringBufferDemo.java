/*String Buffer same methods use in string Builder
String buffer= Synchronous 
StringBuilder= Asynchronous */


class StringBufferDemo
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer();
		System.out.println("capacity="+sb.capacity());
		 System.out.println("intial="+sb);
		 
		
		sb.append("hello lj");
		System.out.println("first string="+sb);
		sb.insert(3,"patel");
		System.out.println("Insert string="+sb);
		
		// ama 0ut put nathi aavtu to Eclipse ma aa folder na name per chhe
	}
}