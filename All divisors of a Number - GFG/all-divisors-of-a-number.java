//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            obj.print_divisors(n);
            System.out.println();
        }
    }
}

// } Driver Code Ends


// class Solution {
//     public static void print_divisors(int n) {
        
//         for(int i=1;i<=n;i++){
//             if(n%i==0){
//                 System.out.print(i+" ");
//             }
//         }
//     }
// }

class Solution {
    public static void print_divisors(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> secondList=new ArrayList<>();
        int sqrtN = (int) Math.sqrt(n);
        
        
        for (int i = 1; i <= sqrtN; i++) {
            if (n % i == 0) {
                list.add(i);
                
                if(n/i!=i){
                    secondList.add(n/i);
                }
            }
        }
        
        
        
        for(int i=secondList.size()-1;i>=0;i--){
            list.add(secondList.get(i));
            
        }
        
        
        for(int div : list){
            System.out.print(div+" ");
        }
        
    }
}
