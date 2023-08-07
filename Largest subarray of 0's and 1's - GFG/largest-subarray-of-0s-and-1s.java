//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.HashMap;

class Largest_Subarray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i = 0; i < N; i++) 
                a[i] = sc.nextInt();
            

            Solution g = new Solution();
            int n = g.maxLen(a, a.length);

            System.out.println(n);

            T--;
        }
    }
}

// } Driver Code Ends




class Solution {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array
    
    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] arr, int n){
        int sum=0;
        int ans=0;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(sum,-1);
        
        
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                sum--;
            }else{
                sum++;
            }
            
            if(map.containsKey(sum)){
                int idx=map.get(sum);
                int max=i-idx;
                
                if(ans<max){
                    ans=max;
                }
            }else{
                map.put(sum,i);
            }
            
        }
        return ans;
    }
}
