//Ques:- Find the sum of 'n' rows of Pascal Triangle.
//
//Hint:- Draw pascal triangle and find sum of each row manually.
//	   You will find values will be in G.P. Series. 
//	   Here Formula:-{((2^n)-1)/2-1}

public class SumofnrowsofpascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum_n_rows(6));
	}

	public static int sum_n_rows(int n)
	{
		//double ans = (Math.pow(2 , n)) -1; 
//		  return (int)ans;
		
		int res = (1 << n);
		return res-1;
	}
	
}
