/*BigInteger and BigDecimal*/

class BigInt 
{
	public static void main(String args[])
	{
		BigInteger x=new BigInteger("12345678912222");
		BigInteger y=new BigInteger("12489012436822");
		BigInteger z=x.multiply(y);
		System.out.println("x*y="+z);
	}
}