//{ Driver Code Starts
//Initial Template for javascript

"use strict";

process.stdin.resume();
process.stdin.setEncoding("utf-8");

let inputString = "";
let currentLine = 0;

process.stdin.on("data", (inputStdin) => {
  inputString += inputStdin;
});

process.stdin.on("end", (_) => {
  inputString = inputString
    .trim()
    .split("\n")
    .map((string) => {
      return string.trim();
    });

  main();
});

function readLine() {
  return inputString[currentLine++];
}

/* Function to print an array */
function printArray(arr, size) {
  let i;
  let s = "";
  for (i = 0; i < size; i++) {
    s += arr[i] + " ";
  }
  console.log(s);
}

function main() {
  let t = parseInt(readLine());
  let i = 0;
  for (; i < t; i++) {
    
    let N = parseInt(readLine());
    let strAr = new Array(N);
    let inputAr = readLine().split(" ");
    for(let i = 0;i<N;i++)
      strAr[i] = inputAr[i];
    let obj = new Solution();
    let res = obj.longestCommonPrefix(strAr,N);
    
    console.log(res);

  }
}
// } Driver Code Ends


//User function Template for javascript

/**
 * @param {string[]} arr
 * @param {number} n
 * @returns {string}
 */

class Solution {
    longestCommonPrefix(arr,n){ 
        // let arr = ["geeksforgeeks", "geeks", "geek", "geezer"];

        let prefix = "";
        let firstString = arr[0];
        
        let isTrue=true;
        for (let i = 0; i < firstString.length; i++) {
            for (let j = 1; j < arr.length; j++) {
                if (firstString[i] !== arr[j][i]) {
                  isTrue=false;
                  // break;
                }
            }
            if(isTrue){
              prefix += firstString[i];
            }
        }
        
        return (prefix==="") ? -1 : prefix;
        // console.log(prefix);


    }
}