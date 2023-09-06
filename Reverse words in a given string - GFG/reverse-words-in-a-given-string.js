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
        let input_line = readLine().split(' ');
        let s = input_line[0];
        let obj = new Solution();
        let ans = obj.reverseWords(s);
        console.log(ans);
    }
}
// } Driver Code Ends


//User function Template for javascript
/**
 * @param {string} s
 * @returns {string}
*/
 

class Solution 
{
    //Function to reverse words in a given string.
    reverseWords(str){
        let arr=str.split(".");
        let res=[]
        
        let count=0;
        for(let i=arr.length-1;i>=0;i--){
          res[count++]=arr[i];
        }
        
        let ans=res.join(".");
        return ans;
    }
}