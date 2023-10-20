//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        Stack<Character> stack=new Stack<>();
        
        
        String ans="";
        int count=0;
        
        while(count!=exp.length()){
            
            char curr=exp.charAt(count);
            if(curr=='+' || curr=='-' || curr=='*' || curr=='/' || curr=='^'){
                
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(curr)) {
                    ans += stack.pop();
                }
                stack.push(curr);
                
            }else if(curr=='('){
                    stack.push(curr);
            }else if(curr==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    ans+=stack.pop();
                }
                stack.pop();
            }else{
                ans+=curr;
            }
            
            count++;
        }
        
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        
        
        return ans;
        
    }
    
    public static int precedence(char ch){
        if(ch=='+' || ch=='-'){
            return 1;
        }else if(ch=='*' || ch=='/'){
            return 2;
        }else if(ch=='^'){
            return 3;
        }
        return -1;
    }
    
}
