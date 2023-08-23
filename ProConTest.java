/*producer() and consumer()       MMM IMP()
wait() and notify()=>object class ma hoy mens cosmic super class*/
class ProCon
{
	boolean isMarked=false;
	int data;
	synchronized void produce(int n)
	{
		if(isMarked)
		{
			
			try
			{
				wait();
				//start();		
			}
			catch(InterruptedException e)
			{
				System.out.println("hi catch"+e);
			}
			
		}
		data=n;
		isMarked=true;
		System.out.println("I AM PRODUCING"+data);
		notify();
	}
	synchronized void consume()
	{
		if(!isMarked)
		{
			try
			{
				wait();
				//start();
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println("I AM CONSUMEING"+data);
		isMarked=false;
		notify();
	}
}
class Producer extends Thread
{
	ProCon pc;
	Producer(ProCon pc)
	{
		this.pc=pc;
		start();
	}
	public void run()
	{
		for(int i=1;i<6;i++)
		{
			pc.produce(i);
		}
	}
}
class Consumer extends Thread
{
	ProCon pc;
	Consumer(ProCon pc)
	{
		this.pc=pc;
		start();
	}
	public void run()
	{
		for(int i=1;i<6;i++)
		{
			pc.consume();
		}
	}
}
class ProConTest
{
	public static void main(String args[])
	{
		ProCon pc=new ProCon();
		Producer p=new Producer(pc);
		Consumer c=new Consumer(pc);
	}
}