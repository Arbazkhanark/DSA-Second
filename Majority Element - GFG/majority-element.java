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
    static int majorityElement(int arr[], int size){
        int majority=arr[0];
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            if(majority==arr[i]){
                count++;
            }else{
                count--;
                if(count==0){
                    majority=arr[i];
                    count=1;
                }
            }
        }
        
        
        // This is for last majority to check if it has greater count than:-- n/2 
        count=0;
        for(int arrs:arr){
            if(majority==arrs){
                count++;
            }
        }
        
        
        return (count>size/2)?majority:-1;
    }
}