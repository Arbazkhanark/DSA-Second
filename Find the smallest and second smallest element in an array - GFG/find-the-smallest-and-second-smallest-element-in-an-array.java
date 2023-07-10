//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            long[] product = obj.minAnd2ndMin(a, n); 
            if(product[0]==-1)
                System.out.println(product[0]);
            else
                System.out.println(product[0]+" "+product[1]);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute 
{
    public long[] minAnd2ndMin(long arr[], long n)  {
        long res[]=new long[2];
        long min=Long.MAX_VALUE;
        long duplicate[]=new long[1];
        long secondMin=-1;
        
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                secondMin=min;
                min=arr[i];
            }else if(arr[i]<secondMin && arr[i]!=min){
                secondMin=arr[i];
            }else if(arr[i] == min){
                count++;
            }
        }
        
        if(count==arr.length-1){
            duplicate[0]=-1;
            return duplicate;
        }
        
        res[0]=min;
        res[1]=secondMin;
        
        return res;
    }
}
