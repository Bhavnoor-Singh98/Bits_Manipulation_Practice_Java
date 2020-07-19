//Ques: Find the position of the Rightmost Set-Bit of a given number.
//
//Ex:- Let number = 12{1100}
//		Rightmost set-bit is the second last bit.
//Output:- 3 {Position of rightmost-bit'1'}

public class RightmostSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//number 
		System.out.println(rightmost(10));
	}
	
	
	public static int rightmost(int n)
	{
		int mask=1;
		//find pos of set bit
		int pos= 1;
		while ((n & mask)== 0)
		{
			pos=pos+1;
			mask = mask<<1;
		}
		
		return pos;
	}

}
