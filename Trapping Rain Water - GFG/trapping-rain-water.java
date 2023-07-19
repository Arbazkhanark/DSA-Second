//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        
        int left=0;
        int right=arr.length-1;
        int leftMax=0;
        int rightMax=0;
        long res=0;
        while(left!=right){
            if(arr[left]<arr[right]){
                if(arr[left]>leftMax){
                    leftMax=arr[left];
                }else{
                    res+=leftMax-arr[left];
                }
                left++;
            }else{
                if(arr[right]>rightMax){
                    rightMax=arr[right];
                }else{
                    res+=rightMax-arr[right];
                }
                right--;
            }
        }
        return res;
    } 
}


