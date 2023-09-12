//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String str){
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int right=0;
        int max=0;
        
        // for(int right=0;right<str.length();right++){
        while(right<str.length()){    
            if(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }else{
                set.add(str.charAt(right));
                if(max<set.size()) max=set.size();
                // max = Math.max(max,right-left+1);
                right++;
            }
           
        }
        
        return max;
    }
}
