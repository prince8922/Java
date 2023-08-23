/*Read FRom File using FileReader*/
import java.io.*;
class ReadFromFileFR
{
	public static void main(String args[]) throws Exception
	{
		FileReader fr1=new FileReader("LJ1.txt");
		FileReader fr2=new FileReader("LJ1.txt");
		BufferedReader br=new BufferedReader(fr1);
		String s=" ";
		while((s=br.readLine())!=null)  //line print  //char
		{
			System.out.println("S="+s); //Hello Brother
			System.out.println(" ");
		}
		int i;
		while((i=fr2.read())!=-1) // file ma ek ek =>binary(Byte) print thse with a space.
		{
			System.out.println("S1="+(char)i); //H E L L O   B ..............
		}
		br.close();
		fr1.close();
		fr2.close();
	}
}