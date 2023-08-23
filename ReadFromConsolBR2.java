/*Read from consol using buffered reader=>read single line only*/
import java.io.*;
class ReadFromConsolBR2
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader isr=new InputStreamReader(System.in);//input 
		BufferedReader br=new BufferedReader(isr);//same as scanner
		String s=" ";
		while(!s.equals("stop")) //jya sudhi stop na lakhi...
		{
			System.out.println("enter Data");
			s=br.readLine();
			System.out.println("S=="+s);
			
		}
		br.close();
		isr.close();
	}
}