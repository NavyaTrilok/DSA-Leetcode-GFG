class StockSpanner {
    
    ArrayList<Integer> al;

    public StockSpanner() {
        al = new ArrayList<>();
    }
    
    public int next(int price) {
        al.add(price);
        int size = al.size();
        int i = size -1;
        int count = 0;
        while(i>=0 && al.get(i)<=price){
            //if(al.get(i)<=price)
                count++;
            i--;
        }
        
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */