/*ForEachloop one d array*/

class ForEachTwo
{
	public static void main(String args[])
	{
		int arr[]={11,20,32,44};		//why arr=> becus array is in built class 

		
		for(int i:arr)     //for each
		{
			System.out.println("vla="+i);  // only i aavse. not arr[i]
		}
	}
}