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
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ArrayList<Integer> primes  = ob.sieveOfEratosthenes(N);
            for(int prime : primes) {
                System.out.print(prime+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    static ArrayList<Integer> sieveOfEratosthenes(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        if (n >= 2) {
            list.add(2);
        }
        for(int i=3;i<= n;i+=2) {
            if(isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }
    
    public static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}



