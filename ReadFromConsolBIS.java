/*BufferInputStream=>Byteor Binary*/
import java.io.*;
class ReadFromConsolBIS
{
	public static void main(String args[]) throws Exception
	{
		BufferedInputStream bis=new BufferedInputStream(System.in);//Scanner
		System.out.println("enter name"); //Prince
		char c=(char)bis.read(); // Read First char of name in consol
		System.out.println("C="+c);//=>P
		bis.close();
	}
}`