//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG
{
    public static void main (String[] args)
	{
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();
            
            int tree[]= new int[n];
            for(int i=0; i<n; i++)
                tree[i] = in.nextInt();
            int k = in.nextInt();
            
            Solution x = new Solution();
            System.out.println( x.find_height(tree,n,k) );
        }
	}
}
// } Driver Code Ends


class Solution
{
    static int find_height(int arr[], int n, int k){
        int start=0;
        int end=-1;
        for(int i=0;i<arr.length;i++){
            if(end<arr[i]){
                end=arr[i];
            }
        }
        
        int res=0;
        while(start<=end){
            int totalWood=0;
            int cutterHeight=(start+end)/2;
            for(int i=0;i<arr.length;i++){
                // totalWood+=arr[i]-cutterHeight;
                totalWood+=Math.max(0,arr[i]-cutterHeight);
            }
            
            if(totalWood>k){
                start=cutterHeight+1;
            }else if(totalWood<k){
                end=cutterHeight-1;
            }
            
            if(totalWood==k){
                return cutterHeight;
            }
        }
        return -1;
    }
}