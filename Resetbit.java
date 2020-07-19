//Ques: Reset the 'I-th' Set-Bit of number and return the new value. Change 'I-th' Bit if it is set i.e. equal to '1'.
//		
//Ex:- number= 22{10110} 
//		I-th=2
//Final Output: 20{10100}		
		
public class Resetbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		number along with position of bit
		System.out.println(resetBit(22, 3));
	}
	public static int resetBit(int n,int i )
	{
		int mask=1;
		//complement of mask
		// left shifting i-1 times
		mask= ~(1 << i-1);
		
		n = n & mask;
		
		return n;
	}

}
