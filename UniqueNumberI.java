//Ques:- We are given an array containg n numbers.
//	All the numbers are present twice except for one number which is only present once. 
//	Find the unique number without taking any extra spaces and in linear time.
//	( Hint - Use Bitwise )

//Input Format:
//First line contains the number n. Second line contains n space separated number.
//
//Constraints
//n < 10^5
//
//Output Format
//Output a single line containing the unique number
//
//Sample Input
//7
//1 1 2 2 3 3 4 
//Sample Output
//4
//Explanation
//4 is present only once

import java.util.*;
public class UniqueNumberI {
    public static void main(String args[]) {
        // Your Code Here
	Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		long a[]=new long[n];
		
		long b=0;

		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextLong();
		}
		
		for(int i=0; i<n; i++)
		{
			b=b^a[i];
		}
	 
		System.out.println(b);
    }
}