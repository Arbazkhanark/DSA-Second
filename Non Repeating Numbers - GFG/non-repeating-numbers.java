//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] singleNumber(int[] nums){
        int xor=0;
        
        for(int i:nums){
            xor=xor^i;
        }
        
        int temp=xor;
        int mask=xor & (~(xor-1));
        
        for(int i:nums){
            if((mask&i)==0){
                temp=temp^i;
            }
        }
        
        int firstNumber=temp;
        int secondNumber=xor^firstNumber;
        
        int ans[]=new int[2];
        
        
        ans[0]=Math.min(firstNumber,secondNumber);
        ans[1]=Math.max(firstNumber,secondNumber);
        
        
        return ans;
        
    }
}