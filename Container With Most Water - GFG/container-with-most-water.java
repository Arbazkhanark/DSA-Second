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
        int left=0;
        int right=len-1;
        long maxArea=-1;
        
        for(int i=0;i<arr.length;i++){
            long height=0;
            long area=-1;
            if(arr[left]<arr[right]){
                height=(long)arr[left];
                left++;
            }else{
                height=(long)arr[right];
                right--;
            }
            
            area=height*(right-left+1);
            
            if(maxArea<area){
                maxArea=area;
            }
        }
        return maxArea;
        
    }
    
}