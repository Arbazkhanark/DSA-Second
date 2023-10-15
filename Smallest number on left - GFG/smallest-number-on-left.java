//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a1[] = in.readLine().trim().split("\\s+");
            int a[] = new int[n];
            for(int i = 0;i < n;i++)
                a[i] = Integer.parseInt(a1[i]);
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.leftSmaller(n, a);
            for(int i = 0;i < n;i++)
                System.out.print(ans.get(i)+" ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java


//User function Template for Java
// class Solution{
//     static List<Integer> leftSmaller(int n, int arr[]){
//         Stack<Integer> stack=new Stack<>();
//         ArrayList<Integer> list=new ArrayList<>();
        
        
//         for(int i=0;i<arr.length;i++){
//             // int prev=arr[i];
//             int curr=arr[i];
//             if(stack.isEmpty()){
//                 stack.push(curr);
//                 list.add(-1);
//             }else{
//                 int top=stack.peek();
//                 if(curr>top){
//                     stack.push(curr);
//                     list.add(top);
//                 }else if(curr<top){
//                     while(!stack.isEmpty() && curr<stack.peek()){
//                         stack.pop();
//                     }
                    
//                     if(stack.isEmpty()){
//                         stack.push(curr);
//                         list.add(-1);
//                     }else{
//                         list.add(stack.peek());
//                     }
//                 }else if(curr==top){
//                     list.add(-1);
//                 }
//             }
//         }
        
//         return list;
//     }
// }



class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
       ArrayList <Integer> l = new ArrayList <>();
       l.add(-1);
       for(int i=1;i<n;i++){
           int min=-1;
           for(int j=0;j<i;j++){
            if(a[j]<a[i]){
                min=a[j];
            } 
           }
           l.add(min);
       }
       return l;
    }
}

