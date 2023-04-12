class MyStack {
    
    Queue<Integer> mainQ;
    Queue<Integer> helperQ;

    public MyStack() {
        mainQ = new ArrayDeque<>();
        helperQ = new ArrayDeque<>();
        
    }
    
    public void push(int x) {
        mainQ.add(x);
    }
    
    public int pop() {
        if(mainQ.size()==0){
            return -1;
        }
        while(mainQ.size() > 1){
           helperQ.add(mainQ.remove()); 
        }
        
        int rv = mainQ.remove();
            
        while(helperQ.size()!=0){
            mainQ.add(helperQ.remove());
        }
        
        return rv;
    }
    
    public int top() {
            if(mainQ.size()==0){
            return -1;
        }
        while(mainQ.size() > 1){
           helperQ.add(mainQ.remove()); 
        }
        
        int rv = mainQ.remove();
        helperQ.add(rv);
            
        while(helperQ.size()!=0){
            mainQ.add(helperQ.remove());
        }
        
        return rv;
    }
    
    public boolean empty() {
        
        if(mainQ.size()==0){
            return true;
        }else{
            return false;
        }
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */