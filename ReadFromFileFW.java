/*Read From file using FileWriter*/

import java.io.*;
class ReadFromFileFW
{
	public static void main(String args[]) throws Exception
	{
		FileWriter fw=new FileWriter("LJ1.txt");
		//FileReader fr1=new FileReader("LJ1.txt");
		//FileReader fr2=new FileReader("LJ1.txt");
		//BufferedReader br=new BufferedReader(fr1);
		String s="hello Brother";
		fw.write(s);
		fw.close();
		
		
	
	}
}