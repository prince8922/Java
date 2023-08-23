/*write proggram check whther the name given from command line is file or not
itr is file then print size of file and if it Directory then it should desplay the name of all file and Directory */
import java.io.*;
class FilePrac1
{
	public static void main(String args[])throws Exception
	{
		int i;
		File f=new File(args[0]);
		if(f.isFile())
		{
			System.out.println("I M File and Size= "+f.length()); //Size
		}
		else if(f.isDirectory())
		{
			System.out.println("it's Folder"+f.getAbsolutePath());
			
			String s1[]=f.list(); //List of File and Directory
			for( i=0;i<s1.length;i++)
			{
				File f1=new File(f.getAbsolutePath()+"/"+s1[i]);
				if(f1.isFile())
				{
					System.out.println(s1[i]+" "+"is File");//name of file s[i]
				}
				else
				{
					System.out.println(s1[i]+" "+"is Folder"); //s1[i]=name
				}
			}
		}	
		else
		{
			System.out.println("not a File and Folder");
		}
	}
}