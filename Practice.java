//Ques:- You are given Q queries each query containing two integers a and b. Your task is to count the number of set-bits
//	   in all numbers between a and b (both inclusive).
//	   
//Ex: Input
// Q=2
// Q1 = 4 1
// Q2 = 10 15
// 
//Output: 2 (for Q1)   
// 		17 (for Q2) 
 
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// entering number of query 
		System.out.println("Enter q: ");
		Scanner sc= new Scanner(System.in);
		int q= sc.nextInt();
		
		if(q==0)
		{
			System.out.println("Enter q greater than 0");
		}
		
		else{
			// checking for a and b 
			for(int i=1; i<=q;i++)
			{
				System.out.println("Enter a and b: ");
				int a= sc.nextInt();
				int b=sc.nextInt();
				
				if(a==0 || b==0){
					System.out.println("Enter value of a and b greater than 0");
				}
				else{
				
					System.out.println("Total number of bits: " + finalTotalbits(a,b));
				}
			}
		}
	}
		
	
	//counting set bits from 1 to n
	public static int finalTotalbits(int a, int b)
	{
		int count=0;
		for(int i=a; i<=b; i++)
		{
			count= count + pertotalBits(i);	
		}
		return count;
	}
	
	// cal set bit for each int
	public static int pertotalBits(int i)
	{
		int pos=0;
		while(i>0)
		{	
			i= i & (i-1);
			pos=pos+1;		
	}	
		return pos;
	}

}
	
