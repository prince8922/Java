/*Thread Exception FrameWork
Thread pool */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Tasks implements Runnable
{
	String name;
	Tasks(String s)
	{
		name=s;
	}
	public void run()
	{
		try
		{
			for(int i=1;i<4;i++) // 1 to 4 
			{
				System.out.println("ExectionTask"+" "+name+i);
				Thread.sleep(1000);
			}
		}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("execution of Thread is completed"+name);
		
	}
}
class ThreadExecutor
{
	static final int MAX_POOL=3;
	public static void main(String args[])
	{
		Tasks t1=new Tasks("First");
		Tasks t2=new Tasks("Second");
		Tasks t3=new Tasks("Third");
		Tasks t4=new Tasks("four");
		Tasks t5=new Tasks("five");
		Tasks t6=new Tasks("sixth");
		ExecutorService pool=Executors.newFixedThreadPool(MAX_POOL);
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		//run() valo max 3 che so 3 sudhi thase pa6i bija 3 thse.
		pool.execute(t4);
		pool.execute(t5);
		pool.execute(t6);
		pool.shutdown();
	}
}