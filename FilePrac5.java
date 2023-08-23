/*Write a proggram to sort the number from One File to another File*/
import java.io.*;
import java.util.*;
class FilePrac5
{
	public static void main(String args[]) throws Exception
	{
		FileReader fr=new FileReader("num1.txt");
		FileWriter fw=new FileWriter("num2.txt");
		BufferedReader br=new BufferedReader(fr);
		PrintWriter pw=new PrintWriter(fw); // for write
		String s=" ";
		int i=0;
		int a[]=new int[5]; //array banavyo
		while((s=br.readLine())!=null)
		{
			a[i]=Integer.parseInt(s);//s=String che ne Int ma fervyu in a[]
			i++;
		}
		Arrays.sort(a);   //line ma lavava
		for(i=0;i<a.length;i++)
		{
			//fw.write(a[i]+System.lineSeparator());
			//fw.write(a[i]+" ");  // aama kay fer nathi padto
			pw.println(a[i]);  //judi line ma
		}
		br.close();
		fr.close();
		pw.close();
		fw.close();
		
	}
}