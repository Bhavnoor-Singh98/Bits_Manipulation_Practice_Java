//Ques:- A magical Number is one which is in power of '5'. Find the "I-th" Magical Number. The Power should not repeat.

//ex:- i=3
//	Magical Number = 30 {(5^2) + (5^1)}


public class Magicalno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(magicNo(2));
	}
	
	//finding ith magical no
	public static int magicNo(int i)
	{
		int pow=1;
		int ans=0;
		while(i!=0)
		{
			pow=pow*5;
			//to get the least significant place with value 1 and add it if it is 1
			if((i & 1) !=0)
			{
				ans = ans + pow;
			}
			// to make i short 
			i = i >> 1;
		}
		return ans;
	}
}
