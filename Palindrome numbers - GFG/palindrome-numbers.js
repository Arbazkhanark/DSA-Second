//{ Driver Code Starts
//Initial Template for javascript


'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}


function main() {
    let t = parseInt(readLine());
    let i = 0;
    for(;i<t;i++)
    {
        let N = parseInt(readLine());
        let obj = new Solution();
        let res = obj.isPallindrome(N);
        console.log(res);
    }
}


// } Driver Code Ends


//User function Template for javascript

/**
 * @param {number} N
 * @return {number}
*/

class Solution {
    isPallindrome(n){
        let x=n.toString(2);
        let mod=0;
        let rev=0;
        let res=0;
        let temp=x;
        while(x!=0){
            mod=x%10;
            rev=rev*10+mod;
            x=parseInt(x/10)
        }
        
          if(temp==rev){
            if(temp<0)return 0;
            return 1;
        }else{
            return 0;
        }
        
    }
}