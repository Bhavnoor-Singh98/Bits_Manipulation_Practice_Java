//Ques: Add one to the number using Bits.
//ex:- 9 + 1=10
	
	
public class AddusingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(add(39));
	}
	
	public static int add(int n)
	{
		int m=1;
		
		//flip digits till we reach the rightmost 0 bit
		while((int) (n & m) >=1)
		{
			n = n ^ m ;
			m = m << 1;
			//changes reflected in m
		}
		//flipping the rightmost 0
		n=n^m;
		return n;
	}

}
