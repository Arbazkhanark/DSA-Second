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
        let n = parseInt(readLine());
        let a = new Array(n);
        let input_ar1 = readLine().split(' ').map(x=>parseInt(x));
        for(let i=0;i<n;i++)
            a[i] = input_ar1[i];
        let obj = new Solution();
        let ans = obj.leaders(a, n);
        let S = '';
        for(let i=0;i<ans.length;i++)
        {
            S+=ans[i];
            S+=' ';
        }
        console.log(S);
    }
}
// } Driver Code Ends


//User function Template for javascript

/**
 * @param {number[]} a
 * @param {number} n
 * @returns {number[]}
 */
 
class Solution {
    //Function to find the leaders in the array.
    leaders(arr, n){
        
        let list=[];
        let max=arr[arr.length-1];
        list.push(max);
        for(let i=arr.length-2;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                list.push(max);
            }

        }
        
        list.reverse();
        
        return list;
    }
}