/*Read from consol using buffered reader=>read single line only
Charcter(Text) reader and writer ===readLine()
*/
import java.io.*;
class ReadFromConsolBR1
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader isr=new InputStreamReader(System.in);//input 
		BufferedReader br=new BufferedReader(isr);  //same as scanner
		System.out.println("enter Data");
		String s=br.readLine();
		System.out.println("S=="+s);
		br.close();
		isr.close();
	}
}