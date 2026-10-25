/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp=head;
        while(temp!=null){
            if(temp.child!=null){
            Node right=temp.next;
            Node child=temp.child;
            Node childTail=child;
            while(childTail.next!=null){
                childTail=childTail.next;
            }
            temp.next=temp.child;
            temp.child.prev=temp;
            temp.child=null;
            childTail.next=right;
            if(right!=null){
                right.prev=childTail;
            }
        }
        temp=temp.next;
        }
        return head;
    }
}