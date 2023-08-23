/*fileoutputstream=>byte or binary write(); in file
File ma write=Output karava*/

import java.io.*;
class WriteToFileFOS
{
	public static void main(String args[]) throws Exception
	{
		FileOutputStream fos=new FileOutputStream("Test123.txt");
		String s="Heloo test";
		byte b[]=s.getBytes(); //string to byte
		fos.write(b); //b (byte vali) to write Test123
		//fos.write(67);
		fos.close();
	
	}
}