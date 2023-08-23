/*Write a pro. to create Directories =>GTU*/
import java.io.*;
class FilePrac2
{
	public static void main(String args[])throws IOException
	{
		File f=new File("D:/home/abc/bcd/def/ghi/jkl");
		f.mkdirs();
		File f1=new File("D:/home/abc/t1.txt");
		File f2=new File("D:/home/abc/t2.txt");
		File f3=new File("D:/home/abc/t3.txt");
		f1.createNewFile();
		f2.createNewFile();
		f3.createNewFile();
		File f4=new File("D:home/abc");
		
		File f5[]=f4.listFiles();
		int i;
		for( i=0;i<f5.length;i++)  //Error to null pointer
		{
			if(f5[i].isFile())
			{
				System.out.println("Size=="+f5[i].length());
				System.out.println("ReadFile"+f5[i].canRead());
				System.out.println("write"+f5[i].canWrite());
				System.out.println("name=="+f5[i].getName());
			}
			else
			{
				System.out.println("is Folder"+f5[i].getName());
			}
		}
	}
}