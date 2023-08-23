/*progaram ex: abstract class must have a one or more method is abstract */

import java.util.*;
abstract class Bank                // ek bank che ani char type name of bank che
{									// 
	int loanAmount;
	void setLoanAmount(int amount)
	{
		loanAmount = amount;
	}
	abstract void getFinalAmount();        
	abstract double getROI(); // rate of intrest
}
class SBI extends Bank
{
	double getROI()
	{
		return 5.01;
	}
	void getFinalAmount()
	{
		//double ROI=getROI();// to S.o.p ma getROI => ROI lakhvanu
		System.out.println("SBIFinalAmountwithROI="+(loanAmount+loanAmount*getROI())+"Rs.");
	}
}
class HDFC extends Bank
{
	double getROI()
	{
		return 5.34;
	}
	void getFinalAmount()
	{
		System.out.println("HDFCFinalAmountwithROI="+(loanAmount+loanAmount*getROI())+"Rs.");
	}
}

class ICICI extends Bank
{
	double getROI()
	{
		return 6.55;
	}
	void getFinalAmount()
	{
		System.out.println("ICICIFinalAmountwithROI="+(loanAmount+loanAmount*getROI())+"Rs.");
	}
}

class AbsROI
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter amount");
		int amt = sc.nextInt();
		
		SBI s= new SBI();
		HDFC h= new HDFC();
		ICICI i = new ICICI();
		
		s.setLoanAmount(amt);
		h.setLoanAmount(amt);
		i.setLoanAmount(amt);
		
		s.getFinalAmount();
		h.getFinalAmount();
		i.getFinalAmount();
		
	}
}