//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.postToPre(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String postToPre(String str) {
        Stack<String> stack=new Stack<>();
        
        String res="";
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            
            if(curr=='+' || curr=='-' || curr=='*' || curr=='/'){
                String b=stack.pop();
                String a=stack.pop();
                
                String temp=curr+a+b;
                stack.push(temp);
            }else{
                String temp=""+curr;
                stack.push(temp);
            }
        }
        
        return stack.pop();
    }
}
