/*TwoDScanner==> use Scaaner to give values by user in aaray 
multiplication of Two 2D array */

import java.util.*;
class TwoDScanner
{
	public static void main(String args[])
	{
		int i,j,row,col;
		int arr[][]= new int[2][2]; //max 2
		int arr1[][]=new int [2][2];
		int c[][]=new int[2][2];
		
		Scanner sc=new Scanner(System.in);  //scane
		System.out.println("enter val of row");
		row=sc.nextInt();
		System.out.println("enter val of col");
		col=sc.nextInt();
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.println("enter values arr=");  //Scane f
				arr[i][j]=sc.nextInt();
			}
		}	
        for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.println("enter values arr1=");  //Scane f
				arr1[i][j]=sc.nextInt();
			}
		}					
		 for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				c[i][j]=arr[i][j]*arr1[i][j];
				
			}
			
		}	
		 for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.println("c["+i+"]["+j+"]="+c[i][j]);
				
			}
			
		}			
		
	}

}