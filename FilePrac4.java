/*Write proggram to replace all word1 by word2 from file1 to file2and replace all*/
import java.io.*;
class FilePrac4
{
	public static void main(String args[])throws Exception
	{
		FileReader fr=new FileReader(args[0]);//f1   //file.txt
		FileWriter fw=new FileWriter(args[1]);//f2       //file.txt
		BufferedReader br=new BufferedReader(fr);
		String s1,s2[],s3=" ";
		int count=0;
		while((s1=br.readLine())!=null)
		{
			s2=s1.split(" ");
			for(int i=0;i<s2.length;i++)
			{
				if(s2[i].equals(args[2])) //ek karta vadhare same word e aavse.
				{
					count++;
					s3=s3+s1+System.lineSeparator();
				}
			}
		}
		String s4=s3.replaceAll(args[2],args[3]);//ji che e,chng kri su lakhvu che
		fw.write(s4);
		br.close();
		fr.close();
		fw.close();
	}
}