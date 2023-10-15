//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends


// class Solution {
//     static boolean ispar(String x) {
//         Stack<Character> stack = new Stack<>();
        
//         stack.push('1');
//         for(int i = 0; i < x.length(); i++) {
//             char str = x.charAt(i);
//             if(stack.peek()==str){
//                 stack.pop();
//             }else{
//                 stack.push(str);
//             }
//         }

//         if(stack.peek()=='1'){
//             return true;
//         }else{
//             return false;
//         }
//     }
// }





class Solution {
    static boolean ispar(String x) {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<x.length();i++){
            char curr=x.charAt(i);
            if(curr=='{' || curr=='(' || curr=='['){
                stack.push(curr);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.peek();
                if((curr=='}' && top=='{') || (curr==')' && top=='(') || (curr==']' && top=='[')){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
        // return true;
    }
}