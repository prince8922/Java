/*fileinputstream =byte or binary read();
File ma thi read=Input*/
import java.io.*;
class ReadFromFileFIS
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream fis=new FileInputStream("abc.txt");//abc File ma
		
		int i;
		while((i=fis.read())!=-1)   //last char sudhi=>-1 i file (all)
		{
			//System.out.print("C="+(char)i);
			System.out.print((char)i);
		}
		fis.close();
	}
}