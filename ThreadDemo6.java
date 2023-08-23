/*Create Thread using Constructer by extending using Thread class
extra name umerva using constructer*/

class ThreadDemo6 extends Thread
{
	String name;
	ThreadDemo6(String name)
	{
		super(name); //pela j aave mathod ma peli line ma
		this.name=name;
		start();
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			Thread t=Thread.currentThread();
			System.out.println("user Thread:"+t.getName()+" "+i);		
		}
	}
	public static void main(String args[])
	{
		ThreadDemo6 td1=new ThreadDemo6("first"); //constructer call
		ThreadDemo6 td2=new ThreadDemo6("Second");
	}
}