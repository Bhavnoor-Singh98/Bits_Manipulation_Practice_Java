//Ques:- You are given a number and you have to find it's "I-th" Bit.
//
//ex:- number = 22. Find it's 1st Bit.
//	Output=0

public class ithbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(ithBit(22, 1));
	}
	public static int ithBit(int n, int i)
	{
		int mask=1;
		mask=1<<(i-1);
		n=n&mask;
		return n; 
	}

}
