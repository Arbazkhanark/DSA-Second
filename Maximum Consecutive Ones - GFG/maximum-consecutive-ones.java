//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] nums = IntArray.input(br, n);
            
            
            int k;
            k = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.longestOnes(n, nums, k);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int longestOnes(int n, int[] arr, int k) {
        int max = 0;
        int left = 0;
        int zeroCount = 0;

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (arr[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            int windowSize = right - left + 1;
            max = Math.max(max, windowSize);
        }

        return max;
    }
}








// class Solution {
//     public static int longestOnes(int n, int[] arr, int k) {
        
//         int max=Integer.MIN_VALUE;
//         int count=0;
//         int temp=k;
        
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==0){
//                 if(temp!=0){
//                     count++;
//                     temp--;
//                     if(max<count){
//                         max=count;
//                     }
//                 }else{
//                     count=0;
//                     temp=k;
//                     break;
//                 }
//             }else if(arr[i]==1){
//                 if(max<count){
//                     max=count;
//                 }
//                 count++;
//             }
//         }
        
//         return max;
//     }
// }


