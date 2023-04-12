class MyQueue {

    Stack<Integer> mainS;
    Stack<Integer> helperS;
    public MyQueue() {
      mainS = new Stack<>();
      helperS = new Stack<>();
    }
    
    public void push(int x) {
        mainS.push(x);
    }
    
    public int pop() {
        
         if(mainS.size()==0){
            return -1;
        }
        
        while(mainS.size()>1){
            int rv = mainS.pop();
            helperS.push(rv);
        }
        
        int rv = mainS.pop();
        
        while(helperS.size()!=0){
            int arv = helperS.pop();
            mainS.push(arv);
        }
        
        return rv;
    }
    
    public int peek() {
        int rv = 0;
        if(mainS.size()==0){
            return -1;
        }else{
                    while(mainS.size()>1){
                        rv = mainS.pop();
                        helperS.push(rv);
                    }

                rv = mainS.peek();

                while(helperS.size()!=0){
                    int arv = helperS.pop();
                    mainS.push(arv);
                }
        }
       
        
        return rv;
    }
    
    public boolean empty() {
        if(mainS.size()==0)
            return true;
        else
            return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */