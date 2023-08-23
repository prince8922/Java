/*This keyword use in 1>current class object
2>call(invokes) current class mathod
3>this()=>use to invoke(call) current class constructer
4>this=> pass as parameter in mathode and constructer
5>this =>return current class instance From mathod */

class Demo
{
	Demo(Test p)
	{
		System.out.println("this as parameter in consructer DEmo="+p.m1+" "+p.m2); //4
	}
	
}

class Test
{
	int m1,m2;
	/*void setData(int m1,int m2)
	{
		this.m1=m1;
		this.m2=m2; // here local variable hide class member variable so we use this key word
	}*/
	
	Test(int x)  // 4
	{
		m1=x;
		m2=x;

	}
	Test()
	{
		this(10); //????      // another mathod ne call karavva  2>.
		
		Demo d= new Demo(this);   // 4 in this in consructer call
		System.out.println("hello Test");
	} 
	void print(Test t)         //parameter in mathod
	{
		System.out.println(" this as parameter in mathod"+" "+t.m1); // 4
	}
	void display()
	{
		print(this);  // print mathod 4 this in mathod
	}
	Test add(Test p,Test q)   // 5 return vali
	{
			m1=p.m1+q.m2;
			m2=p.m2+q.m2;
			return this;
	}
	void getData()
	{
		System.out.println("m1="+m1);
		System.out.println("m2="+m2);
	}
	
}

class ThisObject
{
	public static void main(String args[])
	{
		Test t1= new Test();// three time hello prince print thasebecuse ofconsructercall thay che t1,t2,t3 ma
		Test t2=new Test();
		Test t3=new Test();
		t1.display();
		t3=t1.add(t1,t2);
		t3.getData();
		
		
		
	}
	
}