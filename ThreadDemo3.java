/*Creating Thread using Constructer
Extra che*/

class ThreadDemo3 implements Runnable
{
	Thread t;
	ThreadDemo3(String name)
	{
		t=new Thread(this,name);
		t.start();
		System.out.println("t="+t);// address
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i+" "+t.getName());
		}
	}
		
		
		public static void main(String args[])
		{
			ThreadDemo3 td1=new ThreadDemo3("first");
			ThreadDemo3 td2=new ThreadDemo3("Second");
		}
	
}