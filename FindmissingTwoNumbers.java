//Ques:- You are given a number 'n'. An array of distinct numbers upto that 'n' of size (n-2) is given.
//Find the two missing numbers.  
//
//ex:- n=7
//	array={2,3,5,6,7}
//	missing numbers = {1,4}



public class FindmissingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		we are given a no "n" and having array of size "n-2"
		// array element should be distinct
		
		int n=8;
		int arr[]={1,3,4,6,5,2};
		
		int z=0;
//		taking xor of array ele
		for(int i=0; i<arr.length; i++)
		{
			z=z^arr[i];
		}
//		taking xor of all no's from 1 to n
		for(int i=1; i<=n; i++)
		{
//			xor the above value from for with all elements till n
			// only left numbers will be there in z
			// here 7^8 will be there
			z=z^i;
		}
//		System.out.println(z);
		
//		Separating 7 and 8 into two groups
		
		//finding the rightmost set bit
		int set_bit = z & ~(z-1);
//		System.out.println(set_bit);
		
//		creating two groups
		int group1=0, group2=0;
		
		//traversing the array
		for(int i=0; i<arr.length;i++)
		{
//			this if tells that the rightmost bit is set
			if( (arr[i] & set_bit) == set_bit)
			{
				group1= group1^arr[i];
				
			}
			//group2 elements which are not set at rightmost
			else{
				group2=group2^arr[i];
				
			}
		}
		for(int i=1; i<=n;i++)
		{
//			this if tells that the rightmost bit is set of n numbers
			if( (i & set_bit) == set_bit)
			{
				group1= group1^i;
			}
			//group2 elements which are not set at rightmost of n elemnts
			else{
				group2= group2^i;
			}
		}
		System.out.println("The first missing number:" + group1);
		System.out.println("The second missing number:" + group2);
	}

}
