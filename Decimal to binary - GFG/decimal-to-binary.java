//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int N = sc.nextInt();
			Solution obj = new Solution();
			obj.toBinary(N);
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	void toBinary(int n) {
		ArrayList<Integer> ans = new ArrayList<>();

		while(n>0){
		    int mod=n%2;
		    ans.add(n%2);
		    n = n/2;
		}
		
		Collections.reverse(ans);
		for(int x : ans){
		System.out.print(x);
		}
	}
}