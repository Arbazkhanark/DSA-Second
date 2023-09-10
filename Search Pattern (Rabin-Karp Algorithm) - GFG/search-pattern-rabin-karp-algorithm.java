//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {

    ArrayList<Integer> search(String pat, String str) {
        ArrayList<Integer> list = new ArrayList<>();

        int n1 = str.length();
        int n2 = pat.length();

        int pSum=0;
        int sSum=0;

        for(int i=0;i<n2;i++){
            pSum +=pat.charAt(i);
            sSum +=str.charAt(i);
        }

        for(int i=n2-1;i<n1;i++){
            int count = 0;

            if (pSum == sSum) {
                for (int j=0;j<n2;j++){
                    if (pat.charAt(j) != str.charAt(i-n2+1+j)) {
                        break;
                    } else {
                        count++;
                    }
                }
                if (count == n2){
                    list.add(i+1-n2+1);
                }
            }

            if(i<n1-1){
                sSum =sSum-str.charAt(i-n2+1)+str.charAt(i+1);
            }
        }
        
        if(list.size()<1){
            list.add(-1);
        }
        
        return list;
    }
}
