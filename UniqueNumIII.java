//Ques:- We are given an array containg n numbers.
//	All the numbers are present thrice except for one number which is only present once. 
//	Find the unique number. Only use - bitwise operators, and no extra space.
//
//Input Format:
//	First line contains the number n. Second line contains n space separated number.
//
//Constraints:
//	N < 10^5
//
//Output Format:
//	Output a single line containing the unique number
//
//Sample Input:
//	7
//	1 1 1 2 2 2 3
//Sample Output:
//	3
//Explanation:
//	3 is present only once



// Java code to find the element 
// that occur only once 

class UniqueNumIII 
{ 
	static final int INT_SIZE = 32; 
	
	// Method to find the element that occur only once 
	static int getSingle(int arr[], int n) 
	{ 
		int result = 0; 
		int x, sum; 
		
		// Iterate through every bit 
		for(int i=0; i<INT_SIZE; i++) 
		{ 
			// Find sum of set bits at ith position in all 
			// array elements 
			sum = 0; 
			x = (1 << i); 
			for(int j=0; j<n; j++) 
			{ 
				if((arr[j] & x) == 0) 
				sum++; 
			} 
			//System.out.println(i+"th sum:" + sum );
			// The bits with sum not multiple of 3, are the 
			// bits of element with single occurrence. 
			if ((sum % 3) == 0) 
			result |= x; 
		} 
		return result; 
	} 
	
	// Driver method 
	public static void main(String args[]) 
	{ 
		int arr[] = {1,1,1,3}; 
		int n = arr.length; 
		System.out.println("The element with single occurrence is " + getSingle(arr, n)); 
	} 
	
} 
// Code contributed by Rishab Jain 
