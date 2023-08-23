/*BigInteger and BigDecimal*/
import java.math.*;
class BigIntDemo
{
	public static void main(String args[])
	{
		BigInteger x=new BigInteger("1234573876367222");
		BigInteger y=new BigInteger("1242436822626886");
		BigInteger z=x.multiply(y);
		System.out.println("x*y="+z);
	}
}