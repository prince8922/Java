/*ussing Runnable interface =>o/p vervikher 
to make name of Thread*/

class ThreadDemo2 implements Runnable
{
	public void run()   //when start() call thay tyare aa call thay 
	{
		for(int i=0;i<5;i++)
		{
			userThread();
			//System.out.println("user Thread"+i);
			
		}
	}
	public void userThread()
	{
		Thread t=Thread.currentThread();
		String s=t.getName();
		System.out.println("Thread name="+s);  //5 var call in run
	}
	public static void main(String args[])
	{
		ThreadDemo2 td=new ThreadDemo2();   // runnable ma be obj. banavva padse
		Thread t1=new Thread(td,"First");    //Thread no start call karavava mate obj. banavo pade
		Thread t2=new Thread(td,"Second");   //obver ride from Thread      
		t1.start();
		t2.start();
			for(int i=0;i<5;i++)
		{
			System.out.println("main Thread"+i);
		}
	}
}