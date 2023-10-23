//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String str){
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(curr=='+' || curr=='-' || curr=='*' || curr=='/'){
                int a=stack.pop();
                int b=stack.pop();

                if(curr=='+'){
                    stack.push(b+a);
                }else if(curr=='-'){
                    stack.push(b-a);
                }else if(curr=='*'){
                    stack.push(b*a);
                }else if(curr=='/'){
                    stack.push(b/a);
                }
            }else{
                stack.push((int)curr-48);
            }
        }
        
        return stack.peek();
    }
}