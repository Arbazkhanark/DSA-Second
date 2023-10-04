//{ Driver Code Starts
//Initial Template for Java

import java.math.*;
import java.util.*;
import java.io.*;

class Driverclass
{
    // Driver Code
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }
    }
    
	public static void main(String args[])
	{
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
		    out.println(new Solution().findLongestConseqSubseq(a, n));
		    t--;
		}
		out.close();
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{   
    static int findLongestConseqSubseq(int arr[], int N){
        HashMap<Integer,Boolean> map=new HashMap<>();
        
        for(int i :arr){
            map.put(i,true);
        }
        
        for(int i=0;i<N;i++){
            int curr=arr[i]-1;
            if(map.containsKey(curr)){
                map.put(arr[i],false);
            }
        }
        
        int count=1;
        int ans=1;
        for(int i : arr){
            if(map.get(i)==true){
                while(map.containsKey(i+count)){
                    count++;
                }
                
                if(count>ans){
                    ans=count;
                }
                count=1;
            }
        }
        if(count>ans){
            ans=count;
        }
        
        return ans;
    }
}
