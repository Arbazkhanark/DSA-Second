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

// class Solution{
//     static int longestSubstrDistinctChars(String str){
        
//         HashSet<Character> set=new HashSet<>();
//         int min=0;
//         for(int i=0;i<str.length();i++){
//           if(set.contains(str.charAt(i))){
//             set.clear();
//           }else{
//             set.add(str.charAt(i));
//             if(min<set.size()){
//               min=set.size();
//             }
//           }
//         }
//         return min;
//     }
// }


class Solution{
    static int longestSubstrDistinctChars(String str){
        HashSet<Character> set=new HashSet<>();
        int max=0;
        int j = 0;
        for(int i=0;i<str.length();i++){
          if(!set.contains(str.charAt(i))){
            set.add(str.charAt(i));
            max = Math.max(max, set.size());
          } else {
            while(j < i && str.charAt(j) != str.charAt(i)){
              set.remove(str.charAt(j));
              j++;
            }
            j++;
          }
        }
        return max;
    }
}
