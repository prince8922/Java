/*Cosmic super class 
all inbuild function to over ride in child class*/

class Test
{
	int a;
	Test(int a)
	{
		this.a=a;
	}
	public String toString() // all datatype converted into String
	{
		return("hi thi toString:"+a);
	}
	public boolean equals(Test t)
	{
		System.out.println("hi boolean");
		if (a==t.a)  //   t1=t2
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class CosmicSupClass
{
	public static void main(String args[])
	{
		Test t1=new Test(10);  // over ride mathod call thse
		System.out.println("Address of object ="+t1); // and override mathod pan print thse
		Test t2=new Test(10);
		System.out.println("Address of object ="+t2);
		
		Test t3=t1; //refrence
		
		//if(t1.equals(t2)) // ( address) compare karse not equal
		//if(t1.equals(t3)) // equal t1=t1
		if(t1.equals(t2)) // (value )compare karse kemke boolean equals in TEst class batavyu che 
		{
			System.out.println("Both object are equal");
		}
		else
		{
			System.out.println("Both object are not equal");
		}
	}
}