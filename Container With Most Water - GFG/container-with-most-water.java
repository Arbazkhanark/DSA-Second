//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
import java.lang.*;


class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine()); // input size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split("\\s+");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    Solve T = new Solve();
            long ans = T.maxArea(arr,n);
            System.out.println(ans);
		}
	}
}

// } Driver Code Ends


//User function Template for Java


class Solve{
    
    long maxArea(int arr[], int len){
        int height=0;
        int distance=0;
        int area=0;
        int max=0;
        int start=0;
        int end=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[start]<=arr[end]){
                height=arr[start];
                distance=end-start;
                area=height*distance;
                start++;
            }else{
                height=arr[end];
                distance=end-start;
                area=height*distance;
                end--;
            }
            
            if(max<area){
                max=area;
            }
        }
        return max;
        
    }
    
}