//Ques:- We are given an array containg n numbers. 
//All the numbers are present twice except for two numbers which are present only once. 
//Find the unique numbers in linear time without using any extra space.
//( Hint - Use Bitwise )
//
//Input Format:-
//First line contains the number n. Second line contains n space separated number.
//
//Constraints
//n < 10^5
//
//Output Format
//Output a single line containing the unique numbers separated by space
//
//Sample Input
//4
//3 1 2 1
//Sample Output
//2 3
//Explanation
//Smaller number comes before larger number


import java.util.*;
public class UniqueNumberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter value of n: ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter n distinct array ele: ");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(uniqueNum(arr));
	}
	static String uniqueNum(int arr[])
	{
		int z=0;
		for(int i=0; i<arr.length; i++)
		{
			// xor of all elements to eliminate repeating ones
			z=z^arr[i];
		}
		// getting the last set bit
		z=z&~(z-1);
		int resultarray[]= {0,0};
		
		for(int num: arr)
		{
			if((num & z)==0) //bit is not set
			{
				resultarray[0] ^= num;
			}
			else {
				resultarray[1] ^= num;
			}
		}
//		int first=resultarray[0];
//		int second=resultarray[1];
		
		if(resultarray[0] > resultarray[1])
		{
			return (resultarray[1] + " " + resultarray[0]);
		}
		else {
			return (resultarray[0] + " " + resultarray[1]);
		}
		
	}
}
