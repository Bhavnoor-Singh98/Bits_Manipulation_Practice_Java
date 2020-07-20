//Ques:- Given a string, count the number of distinct subsequences of it ( including empty subsequence ). 
//	For the uninformed, A subsequence of a string is a new string which is formed from the original string by
//	deleting some of the characters without disturbing the relative positions of the remaining characters.
//	For example, "AGH" is a subsequence of "ABCDEFGH" while "AHG" is not.
//
//Input Format
//First line of input contains an integer 't' denoting number of test cases.
//Next t lines contain a string each.
//
//Constraints
//1<=t<=100
//1<=length of s<=100000
//s will contain upper letters only.
//
//Output Format
//For each test case ,print ans%1000000007 in a new line each ,where ans is the number of distinct subsequences.
//
//Sample Input
//2
//AAA
//ABCDEFG
//Sample Output
//4
//128
//Explanation
//For "AAA" , the distinct subsequences that can be formed are { '', 'A' , 'AA' , 'AAA }. So we print 4 , no of distinct subsequences.

import java.util.ArrayList; 
import java.util.Arrays; 
public class CountSubsequence { 
      
    static final int MAX_CHAR = 256; 
       
    // Returns count of distinct sunsequences of str. 
    static int countSub(String str) 
    { 
        // Create an array to store index 
        // of last 
        int[] last = new int[MAX_CHAR]; 
        Arrays.fill(last, -1); 
          
        // Length of input string 
        int n = str.length(); 
       
        // dp[i] is going to store count of distinct 
        // subsequences of length i. 
        int[] dp = new int[n+1]; 
       
        // Empty substring has only one subsequence 
        dp[0] = 1; 
       
        // Traverse through all lengths from 1 to n. 
        for (int i=1; i<=n; i++) 
        { 
            // Number of subsequences with substring 
            // str[0..i-1] 
            dp[i] = 2*dp[i-1]; 
       
            // If current character has appeared 
            // before, then remove all subsequences 
            // ending with previous occurrence. 
            if (last[(int)str.charAt(i-1)] != -1) 
                dp[i] = dp[i] - dp[last[(int)str.charAt(i-1)]]; 
       
            // Mark occurrence of current character 
            last[(int)str.charAt(i-1)] = (i-1); 
        } 
       
        return dp[n]; 
    } 
       
    // Driver code 
    public static void main(String args[]) 
    { 
       System.out.println(countSub("AAA")); 
    } 
}