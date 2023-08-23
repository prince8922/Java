/*Write A Proggram To Dispaly bytes Of File In REverse Sequnce
Provide the name of File Using Command Line args*/
//seek();=>masured biginning of File to end
import java.io.*;
class FilePrac6
{
	public static void main(String args[])throws Exception
	{
		long i;
		RandomAccessFile raf= new RandomAccessFile(args[0],"rw"); //file ma lakelu read and write thay
		long pos=raf.length();//pos=>curssor position
		for(i=pos-1;i>=0;i--)
		{
			raf.seek(i);  //masureed last of File to first.
			byte b=raf.readByte(); //conv. to Byte
			System.out.println((char)b);  //return char
		}
	}
}