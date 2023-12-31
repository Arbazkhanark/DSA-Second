//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends




//User function Template for Java

class Solution 
{
    public static Boolean isPossible(int arr[],int totalStudents,int mid){
        int student=1;
        int sumPage=0;
        
        //// Checking if allocations are possible.
        for(int i=0;i<arr.length;i++){
            if(sumPage+arr[i] <= mid){
                sumPage+=arr[i];
            }else{
                student++;
                if(student>totalStudents || arr[i]>mid){
                    return false;
                }
                sumPage=arr[i];
            }
        }
        return true;
    }
    
    
    //Function to find minimum number of pages.
    public static int findPages(int[]arr,int numberOfBooks,int totalStudents)
    {
        
    /////  If students Greater than No.Of BOOKS    
        if(numberOfBooks<totalStudents){
            return -1;
        }
        
        int end=0;
        for(int i=0;i<arr.length;i++){
            end+=arr[i];
        }

        int start=0;
        
        
        int res=-1;
        while(start<=end){

            int mid=(start+end)/2;
            
            //// Checking if allocations are possible.
            if( isPossible( arr, totalStudents, mid )){
                res=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return res;   
    }
}