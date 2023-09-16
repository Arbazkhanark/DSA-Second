//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int arr[], int n){
        int maj=arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(maj==arr[i]){
                count++;
            }else{
                count--;
                if(count==0){
                    maj=arr[i];
                    count++;
                }
            }
        }
        
        count=0;
        for(int i=0;i<arr.length;i++){
            if(maj==arr[i]){
                count++;
            }
        }
        
        if(count>n/2){
            return maj;
        }else{
            return -1;
        }
        
        
    }
}