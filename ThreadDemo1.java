/*ussing Runnable interface*/
class ThreadDemo1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("user Thread"+i);
		}
	}
	public static void main(String args[])
	{
		ThreadDemo1 td=new ThreadDemo1();// runnable ma be obj. banavva padse
		Thread t=new Thread(td);         //Thread no start call karavava mate obj. banavo pade
		t.start();
		//t1.start(); =>run 2 var call thse
			for(int i=0;i<5;i++)
		{
			System.out.println("main Thread"+i);
		}
	}
}