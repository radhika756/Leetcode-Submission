/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reverse(ListNode s,ListNode e){
        ListNode curr=s;
        ListNode prev=null;
       
        while(prev!=e){
         ListNode temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1) return head;
       ListNode s=head;
       ListNode e=head;
       int i=k-1;
       while(i--!=0){
        e=e.next;
        if(e==null){
            return head;
        }
       } 
       ListNode ans=reverseKGroup(e.next,k);
       reverse (s,e);
       s.next=ans;
       return e;
    }
}