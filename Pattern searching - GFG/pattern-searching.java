//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String str;
            str = br.readLine();
            
            
            String pat;
            pat = br.readLine();
            
            Solution obj = new Solution();
            boolean res = obj.searchPattern(str, pat);
            
            if(res)
            System.out.println("Present");
            else
            System.out.println("Not present");
        }
    }
}

// } Driver Code Ends


class Solution {
    public static boolean searchPattern(String str, String pat) {
        
        int n1=str.length()-1;
        int n2=pat.length()-1;
        for(int i=0;i<=n1-n2;i++){
            int j=0;
            for(;j<=n2;j++){
                if(str.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
            }
            if(n2+1==j){
                return true;
            }
        }
        return false;
    }
}
        
