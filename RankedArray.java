/*Ragged array in 2D array*/

class RankedArray
{
	public static void main(String args[])
	{
		int arr[][]=new int [3][];
		                //column
		arr[0]= new int [1];                   //pela row one column
 		arr[1]=new int [2];             //2nd row ma 2 column
		arr[2]= new int [3];                    // third row ma 3 column
		
		arr[0][0]=10;  // first Row

		arr[1][0]=40;	//second
		arr[1][1]=50;
		
		arr[2][0]=70;
		arr[2][1]=80;   //third 
		arr[2][2]=90;
		
		for(int i=0;i<arr.length;i++)              //for each i=row
		{
			for(int j=0;j<arr[i].length;j++)                     //for each j=column
			{
				System.out.print(arr[i][j]+"\t");
			}
					System.out.println(); //j ni for loop puri thay tya "\n";
		}
	}
}