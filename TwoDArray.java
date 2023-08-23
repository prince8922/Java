/* TwoDArray print with Static value*/
class TwoDArray
{
	public static void main(String args[])
	{ 
		int i,j;
		int array[][]={{10,20,30},{33,44,23}};   //i=0,1 && j=0,1,2 		
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(array[i][j]+"\t");    //"\t" for a space
			}
			System.out.println();   //"\n" or "ln" for next line 
		}
		
	}
}