/*write a prigram to copy all contains from file1 to file 2 */
import java.io.*;
class FilePrac3
{
	public static void main(String args[])throws Exception
	{
		FileReader fr=new FileReader("Test1.txt");
		FileWriter fw=new FileWriter("Test2.txt");
		BufferedReader br=new BufferedReader(fr);
		String s=" ";
		while((s=br.readLine())!=null)
		{
			fw.write(s+System.lineSeparator());  // as well /n=>new Line in file2
		}
		br.close();
		fr.close();
		fw.close();
	}
}