/*method overloding and consructer overloding
depends on no of parameters and type of perameters=> book ma che ex:
not on return type*/

class Employe
{
	float pds; //per day salary
	float ab; // absent
	double bs;  // basic salary
	Employe()  // default constructer
	{
		pds=500;
		ab=0;
		bs=25000;
	}
	Employe(float a,float b,double d) // parameter consructer
	{
			pds=a;
			ab=b;
			bs=d;
	}
	void salaryCalculation()
	{
		System.out.println("basic salary"+bs);
	}
	void salaryCalculation(int lup) //leave with pay=>
	{
		float total=(30-ab)*pds;
		System.out.println("total salary="+total);
		System.out.println("leave With pay="+lup);
	}
	void salaryCalculation(int lwp,int el) //leave with pay and 
	{
		double total=(30-ab)*pds+bs;
		System.out.println("full salary="+total);
		System.out.println("lwp="+lwp);
		System.out.println("el="+el);
	}
	
	

}

class EmpSalary
{
	public static void main(String args[])
	{
		Employe e1= new Employe();          //default consructer call when object created
		Employe e2 = new Employe(1500.33f,3f,33000);  //parametre consructer call
		e1.salaryCalculation();   // call karvyu
		e2.salaryCalculation(3); // same mathod and diff parameter  
		e1.salaryCalculation(2,2);
	}
}