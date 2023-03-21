class MyLinkedList {
    
    Node head;
    int size;
    
    class Node{
        int val;
        Node next;
            
        public Node(int val){
            this.val = val;
        }
   
    }

    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        if(index < 0 || index >= size)
            return -1;
        Node temp = head;
        int n = 0;
        while(n != index){
            temp = temp.next;
            n++;  
        }
        
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
        size++;
    }
    
    public void addAtTail(int val) {
        if(size==0){
            addAtHead(val);
        }else{
                
                Node newnode = new Node(val);
                newnode.next = null;
                Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                
                temp.next = newnode;
                size++;
        }
      
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size)
            return;
        if(index == 0)
            addAtHead(val);
        else if(index == size)
            addAtTail(val);
        else{
            
                int n = 1;
                Node itr = head;
                Node ans = null;
                while(itr.next != null){
                    if(n == index){
                        ans = itr;
                    }
                    itr=itr.next;
                    n++;    
                }
                Node newnode = new Node(val);
                newnode.next=ans.next;
                ans.next=newnode;
                size++;
        }
        
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size)
            return;
        if(index == 0){
            Node temp = head.next;
            head = temp;
            size--;
        }
            
        else{
            //Node temp = head;
            Node prev = head;
            int n = 1;
            while(n != index){
                prev = prev.next;
                n++;
                
            }
            prev.next = prev.next.next;
            size--;
        }
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