/*sleep() and join() and isAlive()
main ma badha SSThread e main Thread hoy*/
class ThreadDemo5 extends Thread
{
	public void run()
	{
		try
		{
			Thread t=Thread.currentThread();
			String s=t.getName();
			for(int i=0;i<2;i++)
			{
				
				System.out.println("User Thread:"+s+"=>"+i);
				Thread.sleep(500); // Exception aave aetle sleep ma try catch
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("hi catch"+e);
		}
	}
	public static void  main(String args[])
	{
		ThreadDemo5 td1=new ThreadDemo5();
		ThreadDemo5 td2=new ThreadDemo5();
		td1.setName("first");
		td2.setName("Second");
		td1.start(); //1 Execution
		try
		{
			System.out.println("for td1="+td1.isAlive());
			
			td1.join(); // aanathi pela first Thred chalu thse pa6i Second aase;
			System.out.println("for td1="+td1.isAlive());
		}
		catch(InterruptedException e)
		{
			System.out.println("main catch"+e);
		}
		td2.start(); // last ma aa Excecution thse
		//1(2) Execution
		//System.out.println("hi main thread");         
		//System.out.println(td1);
		//System.out.println(td2);
		//	System.out.println(Thread.currentThread());
	}
}