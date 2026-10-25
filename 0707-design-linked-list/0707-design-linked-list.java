class MyLinkedList {
    class ListNode{
      int val;
      ListNode next;
      ListNode(int val){
        this.val=val;
        this.next=null;
      }
    }
    ListNode head;
    int size;
    public MyLinkedList() {
       head=null; 
       size=0;
    }
    
public int get(int index) {
    if(index < 0 || index >= size) return -1;

    ListNode temp = head;
    int i = 0;

    while(i < index) {
        temp = temp.next;
        i++;
    }

    return temp.val;
}

    
    public void addAtHead(int val) {
        size++;
        ListNode newNode=new ListNode(val);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    
    public void addAtTail(int val) {
     ListNode newNode=new ListNode(val);
     size++;
     if(head==null){
        head=newNode;
        return;
     }
     ListNode temp=head;
     while(temp.next!=null){
        temp=temp.next;
     }
     temp.next=newNode;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size) return;
          if(index == 0) {
        addAtHead(val);
        return;
    }
         ListNode newNode=new ListNode(val);
         size++;
         ListNode temp=head;
         index=index-1;
        int i=0;
        while(i<index){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    
    public void deleteAtIndex(int index) {
          if(index<0 || index>=size){
            return;
        }
        if(index == 0) {
        head = head.next;
        size--;
        return;
    }
        size--;
        index=index-1;
        int i=0;
       ListNode temp=head;
        while (i<index){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */