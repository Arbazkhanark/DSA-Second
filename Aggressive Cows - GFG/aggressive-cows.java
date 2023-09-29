//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int solve(int n, int k, int[] arr) {
        Arrays.sort(arr);
        
        int start=0;
        int end=arr[arr.length-1];
        
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            
            if(isSafe(arr,k,mid)){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }    
        }
        return ans;
    }
    
    public static boolean isSafe(int arr[],int k,int mid){
        
        int count=1;
        int cows=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]-cows>=mid){
                count++;
                if(count==k){
                    return true;
                }
                cows=arr[i];
            }
            
        }
        return false;
    }
    
}