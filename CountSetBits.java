//Ques:- count number of 1s in binary representation of an integer

//Input Format:-
//Input N = Number of Test Cases, followed by N numbers

//Output Format:-
//Number of Set Bits in each number each in a new line

//Sample Input:
//3
//5
//4
//15
//Sample Output:-
//2
//1
//4
//Explanation:
//Convert Binary to Decimal first and then count number of 1's present in all digits.


import java.util.*;
public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of test cases: ");
		int n= sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter values to be tested: ");
		for(int i=0; i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		countBits(a,n);
	}
	public static void countBits(int a[], int n)
	{ 
		
		for(int i=0; i<n; i++)
		{	
			int sum=0;
			int z=1;
			while(a[i]>0)
			{
				if((z & a[i])==1)
				{
				 sum++;
				}
				
				a[i]=a[i]>>1;
			}
			System.out.println((i+1) +" position has bits:"+sum);
		}
	}
}
