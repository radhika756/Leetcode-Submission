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
    public ListNode removeNodes(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head=prev;

        int max=head.val;

        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.next.val<temp.val){
                temp.next=temp.next.next;
            }
            else{
                max=temp.next.val;
                temp=temp.next;
            }
        }
         prev=null;
         curr=head;
        while(curr!=null){
            ListNode tem=curr.next;
            curr.next=prev;
            prev=curr;
            curr=tem;
        }
        return prev;
    }
}