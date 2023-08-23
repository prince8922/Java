/*suspand() and resume()
aanu online output jovanu*/
class ThreadDemo7 extends Thread
{
	String name;
	ThreadDemo7(String name)
	{
		this.name=name;
		start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<3;i++)
			{
				System.out.println(name+"="+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Thread"+name+"Execution Done");
	}
	public static void main(String args[])
	{
		ThreadDemo7 td1=new ThreadDemo7("Test");
		ThreadDemo7 td2=new ThreadDemo7("Second");
		try
		{
			Thread.sleep(500);
			//td1.join();
			td1.suspend();          //new ma warnings aave depriciated
			System.out.println("Thread test suspanded");
			td1.resume();
			System.out.println("Thread test resumed");
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("main exception executed");
	}
} 