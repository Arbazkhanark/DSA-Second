//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/
class Solution {
    // Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second) {
        Node rev1=null;
        while(first!=null) {
            Node temp=first.next;
            first.next=rev1;
            rev1=first;
            first=temp;
        }

        Node rev2=null;
        while(second!=null) {
            Node temp=second.next;
            second.next=rev2;
            rev2=second;
            second=temp;
        }

        Node ans=null;
        Node sum=null;
        int carry=0;
        while (rev1!=null || rev2!=null || carry!=0) {
            int x=(rev1!=null) ? rev1.data:0;
            int y=(rev2!=null) ? rev2.data:0;
            int sumVal =carry+x+y;
            carry =sumVal/10;
            sumVal =sumVal%10;
            Node temp =new Node(sumVal);
            if (ans==null) {
                ans=temp;
                sum=ans;
            } else {
                sum.next=temp;
                sum=temp;
            }

            if (rev1 != null) rev1 = rev1.next;
            if (rev2 != null) rev2 = rev2.next;
        }
        
        Node prev=null;
        while(ans!=null){
            Node temp=ans.next;
            ans.next=prev;
            prev=ans;
            ans=temp;
        }

        return prev;
    }
}
