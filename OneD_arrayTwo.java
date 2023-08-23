/*oneD2*/
class OneD_arrayTwo
{
	public static void main(String args[])
	{
		int sallary[]=new int [4];   //declaration=fer na pade value aapvi e becuse of i;
		sallary[0]=7000;
		sallary[1]=10000;
		sallary[2]=15000;
		sallary[3]=30000;
		//or sallary []={7000,1000,15000,30000};
		for(int i=0;i<4;i++)  //i from decalre of array
		{
			if(sallary[i]>10000) //sallary great 10k
		    {	
				System.out.println("sallary["+i+"]="+sallary[i]);
			}
				System.out.println("i="+" "+i);  //space mate(" ")
	}	}
}