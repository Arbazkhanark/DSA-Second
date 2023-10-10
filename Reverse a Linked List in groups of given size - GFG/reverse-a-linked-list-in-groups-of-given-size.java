//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class ReverseInSize
{
    static Node head;
    
    public static void main (String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = Integer.parseInt(s[i]);
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }
            
            int k = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            Node res = ob.reverse(head, k);
            printList(res,out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node node,PrintWriter out)
    {
        while(node != null)
        {
            out.print(node.data + " ");
            node = node.next;
        }
    }
    
}


// } Driver Code Ends


/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node reverse(Node node, int k) {
        Node curr = node;
        Node prev = null;
        Node next = null;
        int count = 0;

        // Reverse first k nodes
        while (count < k && curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        // Recursively call for the rest of the list and link it to the reversed part
        if (next != null) {
            node.next = reverse(next, k);
        }

        // 'prev' is now the new head of this section
        return prev;
    }
}


// class Solution {
//     public static Node reverse(Node node, int k) {
//         Node curr = node;
//         Node prevTail = null;
//         Node newHead = null;

//         while (curr != null) {
//             Node prev = null;
//             Node tail = curr;

//             int count = 0;
//             while (curr != null && count < k) {
//                 Node next = curr.next;
//                 curr.next = prev;
//                 prev = curr;
//                 curr = next;
//                 count++;
//             }

//             if (newHead == null) {
//                 newHead = prev;
//             }

//             if (prevTail != null) {
//                 prevTail.next = prev;
//             }

//             prevTail = tail;
//         }

//         return newHead;
//     }
// }


