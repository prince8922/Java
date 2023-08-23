/**/
import java.io.*;
class FileDemo
{
	public static void main(String args[]) 	throws Exception
	{
		File f1=new File("abc.txt");
		//try
		//{
			if(f1.createNewFile())  //boolean
			{
				System.out.println("New FileCreated");
			}
			else
			{
				System.out.println("already Exist");
			}
			File f2=f1.getCanonicalFile();  //path of f2
			System.out.println("1f1="+f1);      //file name
			System.out.println("2f2="+f2);  //canonical File=Path
			System.out.println("3parentf2=="+f2.getParent());  //Path ma one back directory
			System.out.println("4pathf2=="+f2.getPath());  //Path 
			System.out.println("5pathf1=="+f1.getPath());  //Path =>file name=>only last directory 
			System.out.println("6pathabsf1=="+f1.getAbsolutePath());  //Path 
			System.out.println("7pathabsf2=="+f2.getAbsolutePath());  //Path  
			System.out.println("8NAme=="+f2.getName());  //name=>abc.txt 
			System.out.println("9canWrite=="+f2.canWrite());   
			System.out.println("10canRead=="+f2.canRead());   
			System.out.println("110isAbsolute=="+f2.isAbsolute());   //true
			System.out.println("12isDirectory=="+f2.isDirectory()); //false=>file che  
			System.out.println("13isFile=="+f2.isFile()); //  
			System.out.println("14canExecute=="+f2.canExecute()); //  
			System.out.println("15length of=="+f2.length()); //

			boolean isExist=false;
			isExist=f2.exists();
			System.out.println("isExists=="+isExist);
			
			
		//}
		/*catch(IOException e)
		{
			System.out.println(e);
		}*/
		
	}
}