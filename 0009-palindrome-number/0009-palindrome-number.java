class Solution {
    public boolean isPalindrome(int x) {
        int rim;
        int rev=0;
        int temp=x;
        boolean is_Palindrome=false;
        while(x!=0){
            rim=x%10;
            rev=rev*10+rim;
            x=x/10;
        }
        if(temp==rev){
            if(temp<0)return is_Palindrome=false;
            return is_Palindrome=true;

        }else{
            return is_Palindrome=false;
        }
    }
}