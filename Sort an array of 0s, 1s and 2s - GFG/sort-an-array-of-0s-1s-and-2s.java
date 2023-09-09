//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int arr[], int n){
        int x=0;int y=0;int z=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                x++;
            }else if(arr[i]==1){
                y++;
            }else{
                z++;
            }
        }
        

        for(int j=0;j<x;j++){
            arr[j]=0;
        }
        
        for(int j=x;j<x+y;j++){
            arr[j]=1;
        }
        
        for(int j=x+y;j<n;j++){
            arr[j]=2;
        }
        
        
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends