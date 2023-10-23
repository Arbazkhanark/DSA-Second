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
        let S = readLine();
        let obj = new Solution();
        console.log(obj.evaluatePostfix(S));
        
    }
}
// } Driver Code Ends


//User function Template for javascript

/**
 * @param {string} S
 * @returns {number}
*/

class Solution
{
    //Function to evaluate a postfix expression.
    evaluatePostfix(str){
        
        let stack=[];
        
        for(let i=0;i<str.length;i++){
            let curr=str[i];
            
            if(curr==='+' || curr==='-' || curr==='*' || curr==='/'){
                let a=parseInt(stack.pop());
                let b=parseInt(stack.pop());
                
                if(curr==='+'){
                    stack.push(b+a);
                }else if(curr==='-'){
                    stack.push(b-a);
                }else if(curr==='*'){
                    stack.push(b*a);
                }else if(curr==='/'){
                    stack.push(b/a);
                }
            }else{
                stack.push(curr)
            }
        }
        
        let res=stack.pop();
        if(res === -0){
            return 0;
        }
        return res;
    }
}