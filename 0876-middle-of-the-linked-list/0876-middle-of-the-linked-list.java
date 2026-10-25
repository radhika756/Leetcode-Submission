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
    public ListNode middleNode(ListNode head) {
        //Broute force 
        // int size=0;
        // ListNode temp=head;
        // while(temp!=null){
        //     size++;
        //     temp=temp.next;
        // }
        // int mid=size/2;
        //  temp=head;
        // while(mid-->0){
        //     temp=temp.next;
        // }
        // return temp;

        //Slow Fast algo

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}