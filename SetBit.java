//Ques:- Set the 'I-th' Bit of a number. If the 'I-th' bit is "0" then make it '1' and if it is already '1' don't change.
//
//Ex:- number=6 {0110}
//	 I-th num= 1
//Output:-7{0111} After setting the 'I-th' Bit	 		 

public class SetBit {

	public static void main(String args[])
	{
		// number whose ith bit is to be set
		System.out.println(setBit(20, 3));
	}
public static int setBit(int n,int i )
{
	int mask=1;
	// left shifting i-1 times
	mask= (1 << i-1);
	
	n = n | mask;
	
	return n;
}
}
