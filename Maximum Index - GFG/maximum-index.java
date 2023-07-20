//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxIndexDiff(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    int maxIndexDiff(int arr[], int n) {
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        int mini=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int k=0;
        
        int last=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mini){
                mini=arr[i];
            }
            left[k++]=mini;
            
            if(arr[last]>max){
                max=arr[last];
            }
            right[last]=max;last--;
        }
        
        

        int maxDiff = 0;
        int start = 0, end = 0;
        while (start < n && end < n) {
            if (left[start] <= right[end]) {
                
                maxDiff = Math.max(maxDiff, end - start);
                end++;
            } else {
                start++;
            }
        }
        return maxDiff;
        
    }
}



// 14
// 47 46 14 1 29 44 19 30 48 47 17 36 41 44,