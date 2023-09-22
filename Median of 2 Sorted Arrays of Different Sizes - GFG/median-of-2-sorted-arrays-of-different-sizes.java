//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends




//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]){
        int n1 = a.length;
        int n2 = b.length;
        if(n1>n2) return medianOfArrays(n, m,b,a);
            
        int start=0;
        int end=n1;
        int total=n+m;
        double median=0;
        
        while(start<=end){
            int mid1=(start+end)/2;
            int mid2=(total+1)/2-mid1;
            
            int maxLeftA = (mid1 == 0) ? Integer.MIN_VALUE : a[mid1 - 1];
            int minRightA = (mid1 == n1) ? Integer.MAX_VALUE : a[mid1];
            
            int maxLeftB = (mid2 == 0) ? Integer.MIN_VALUE : b[mid2 - 1];
            int minRightB = (mid2 == n2) ? Integer.MAX_VALUE : b[mid2];
            
            if(maxLeftA <= minRightB && maxLeftB <= minRightA){
                if(total%2 == 0){
                    median = (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2.0;
                }else{
                    median = Math.max(maxLeftA, maxLeftB);
                }
                break;
            }else if(maxLeftA > minRightB){
                end = mid1 - 1;
            }else {
                start = mid1 + 1;
            }
        }
        
        return median;
    }
}
