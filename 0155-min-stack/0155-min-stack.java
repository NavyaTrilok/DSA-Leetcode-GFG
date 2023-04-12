class MinStack {

    Stack<Integer> minData;
    Stack<Integer> allData;
    
    public MinStack() {
        allData = new Stack<>();
        minData = new Stack<>();
    }
    
    public void push(int val) {
       if(allData.size() == 0){
            allData.push(val);
            minData.push(val);
        }
        else if(val<=minData.peek()){
            allData.push(val);
            minData.push(val);
        }else{
            allData.push(val);
        }
    }
    
    public void pop() {
        /*if(allData.size() == 0){
            return -1;
        }*/
        int rv = allData.pop();
        if(rv == minData.peek()){
            minData.pop();
        }
        //return rv;
    }
    
    public int top() {
        if(allData.size() == 0){
            return -1;
        }
        
       return allData.peek();
        
    }
    
    public int getMin() {
         if(minData.size() == 0){
            return -1;
        }
        
       return minData.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */