/*simpal extends Thread class to override run mathod*/
class ThreadDemo extends Thread
{
	public void run()  //over ride from Thread class
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("user Thread"+i);
		}
	}
	public static void main(String args[])
	{
		ThreadDemo td=new ThreadDemo();
		td.start();                  //Td object no class e direct Thread ne extends kare che 
			for(int i=0;i<5;i++)  // start()  Thread ma che
		{
			System.out.println("main Thread"+i);
		}
	}
}