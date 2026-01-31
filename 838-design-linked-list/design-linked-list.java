class MyLinkedList {
    class node{
        int val ;
        node next;
    }
    private node head;
    private int size ;
    private node tail;

    public MyLinkedList() {
        
        head = null;
        tail = null;
        size =0;

    }
    
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        node temp = head;
        for(int i = 0;i<index;i++ ){
            temp = temp.next;
            
        }
        return temp.val;
    }
     
    public node getkth(int index) {
        node temp = head;
        for(int i = 0;i<index;i++ ){
            temp = temp.next;
            
        }
        return temp;
    }
    
    public void addAtHead(int val) {
        node nn = new node();
        nn.val = val;
        
        if(size == 0){
            head = nn ;
            tail = nn;

        }else{
            nn.next = head ;
            head = nn;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        
        if(size == 0){
            addAtHead(val);
        }else{
            node nn = new node();
            nn.val = val;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        if(index == 0){
            addAtHead(val);
        }else if(size ==index ){
            addAtTail(val);
        }else{
                node nn = new node();
                nn.val = val;
                node kth =  getkth(index - 1);
                nn.next = kth.next;
                kth.next = nn;
                size++;
        }
    }
    
    public void deleteAtIndex(int index) {
         if (index < 0 || index >= size) return;

        if (index == 0) {
            head = head.next;
            if (size == 1) tail = null;
        } else {
            node prev =  getkth(index - 1);
            prev.next = prev.next.next;
            if (index == size - 1) tail = prev;
        }
        size--;
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