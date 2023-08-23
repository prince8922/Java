/*BigDecimal   Round_up*/
/*BigInteger and BigDecimal*/

import java.math.*;
class BigDeciDemo          //jdf na version na deprication override aave
{
	public static void main(String args[])
	{
		BigDecimal x=new BigDecimal("123457387636.7222");
		BigDecimal y=new BigDecimal("124243682262.6886");
		BigDecimal z=x.divide(y,3444,BigDecimal.ROUND_UP);  // point pa6i 3444 aakda aavse 
		System.out.println("x/y="+z); //|| round up thse it is a variable 
	}
}