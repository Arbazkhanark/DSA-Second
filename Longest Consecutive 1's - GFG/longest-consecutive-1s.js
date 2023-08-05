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
        let input_line = readLine().split(' ').map(x=>parseInt(x));
        let n = input_line[0];
        let obj = new Solution();
        console.log(obj.maxConsecutiveOnes(n))
    }
}
// } Driver Code Ends


//User function Template for javascript

/**
 * @param {Number} N
 * @returns {Number}
*/
// Function to calculate the longest consecutive ones
class Solution {
    
    maxConsecutiveOnes(n){
        let res=[];
        
        while(n>0){
            let rem=n%2;
            n=parseInt(n/2);
            res.push(parseInt(rem));
        }
        
        let binary=res.reverse();
        // console.log(binary);
        let count=0;
        let max=0;
        for(let i=0;i<binary.length;i++){
            if(binary[i]==1){
                count++;
            }else{
                if(max<count){
                    max=count;
                }
                count=0;
            }
        }
        
        if(max<count){
            max=count;
        }
        
        return max;
        
    }
}