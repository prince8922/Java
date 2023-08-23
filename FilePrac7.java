/*Occurence Of digit 5*//*extera ex by me*/
import java.io.*;
class FilePrac7
{
	public static void main(String args[])throws Exception
	{
		FileReader fr=new FileReader("args[0]");
		BufferedReader br=new BufferedReader(fr);
		String s1;
		int count=0;
		While((s1=br.readLine())!=null)
		{
			For(int i=0;i<s1.length;i++)
			{
				if(s1.charAt(i)=='5')
				{
					count++;
				}	
			}
		}
		System.out.println("Total Occurence ogf 5=="+count);
	}
}