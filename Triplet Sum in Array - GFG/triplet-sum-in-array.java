//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int X = Integer.parseInt(inputLine[1]);
		    int A[] = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        A[i] = Integer.parseInt(inputLine[i]);
		    }
		    Solution ob=new Solution();
		    boolean ans = ob.find3Numbers(A, n, X);
		    System.out.println(ans?1:0);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to find if there exists a triplet in the 
    //array arr[] which sums up to sum.
    public static boolean find3Numbers(int arr[], int n, int sum) { 

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int search=sum-arr[i];
            
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                int tempSum=arr[left]+arr[right];
                if(tempSum==search){
                    return true;
                }else if(tempSum>search){
                    right--;
                }else if(tempSum<search){
                    left++;
                }
            }
        }

        return false;
    }
}
