//Ques:- We are given two coins of value x and y. 
//	We have to find the maximum of value of a XOR b where x <= a <= b <= y.
//
//Input Format
//We are given two integers x and y
//
//Constraints
//l <= r <= 1000
//
//Output Format
//Print the maximum value of a XOR b
//
//Sample Input
//5
//6
//Sample Output
//3
//Explanation
//If a and b are taken to be 5. Then a xor b = 0
//If a and b are taken to be 6. Then a xor b = 0
//If a is 5 and b is 6. Then a xor b is 3.


import java.util.*;
public class XorProfit {
	public static void main(String args[])
	{
		System.out.println("Enter two numbers: ");
		Scanner sc=new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		
		System.out.println(findProfit(firstNum,secondNum));
	}
	public static int findProfit(int n1, int n2)
	{
		// finding Xor of the numbers
		int z = n1^n2;
		
		// finding the position of the most significant bit
		int msb=0;
		
		while(z>0)
		{
			msb++;
			z=z>>1;
		}
		//System.out.println(msb);
		
		//finding max xor between that range
		int res=1;
		while(msb-- > 0)
		{
			res=res<<1;
		}
		return (res-1);
	}

}
