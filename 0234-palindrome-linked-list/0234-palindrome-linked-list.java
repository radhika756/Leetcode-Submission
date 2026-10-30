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
    public ListNode middle(ListNode head){
         ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode a=head;
        ListNode b=head.next;
        ListNode c=head.next.next;

        while(b!=null){
            b.next=a;
            a=b;
            b=c;
            if(c!=null)c=c.next;
        }
        head.next=null;
        return a;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode mid=middle(head);
        ListNode sec=reverse(mid);
        ListNode first=head;
        while(sec!=null){
            if(first.val!=sec.val) return false;
            first=first.next;
            sec=sec.next;
        }
        return true;
    }
}
