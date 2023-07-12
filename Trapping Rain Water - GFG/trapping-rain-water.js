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
        let arr = new Array(n);
        let input_ar1 = readLine().split(' ').map(x=>parseInt(x));
        for(let i=0;i<n;i++)
            arr[i] = input_ar1[i];
        let obj = new Solution();
        console.log(obj.trappingWater(arr, n));
        
    }
}
// } Driver Code Ends


//User function Template for javascript

/**
 * @param {number[]} arr
 * @param {number} n
 * @returns {number}
*/

class Solution {
    // Function to find the trapped water between the blocks.
    trappingWater(arr, n){
        let left=[];
        let right=[];
        let leftMax=-1;
        let rightMax=-1;
        let count=0;
        let end=arr.length-1;
        
        for(let i=0;i<arr.length;i++){
            if(arr[i]>leftMax){
                leftMax=arr[i];
            }
            left[count]=leftMax;
            count++;
            
            
            if(arr[end]>rightMax){
                rightMax=arr[end];
            }
            right[end]=rightMax;
            end--;
        }
        
        
        let sum=0;
        for(let i=0;i<arr.length;i++){
            if(left[i]<right[i]){
                sum+=left[i]-arr[i];
            }else{
                sum+=right[i]-arr[i];
            }
        }
        
        return sum;
        
        
    }
}