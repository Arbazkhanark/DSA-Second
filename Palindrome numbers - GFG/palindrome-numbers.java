//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Long t = Long.parseLong(read.readLine());
        while(t-- > 0)
        {
            long N = Long.parseLong(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPallindrome(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long isPallindrome(long n){
     String val = Long.toBinaryString(n); 
     
     int left=0;
     int right=val.length()-1;
     
     while(left<right){
         if(val.charAt(left)!=val.charAt(right)){
             return 0;
         }
         left++;right--;
     }
     
     return 1;

    }
}