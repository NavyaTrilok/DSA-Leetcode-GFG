class RandomizedSet {

  Set<Integer> st;
    public RandomizedSet() {
        st = new HashSet<>();
    }
    
    public boolean insert(int val) {
        
        if(st.contains(val)) return false;
        else{
            st.add(val);
            return true;
        }
        
    }
    
    public boolean remove(int val) {
        
        if(st.contains(val)){
            st.remove(val);
            return true;
        }else{
            return false;
        }
        
    }
    
    public int getRandom() {
        Integer[] arrayNumbers = st.toArray(new Integer[st.size()]);
  
        // generate a random number
        Random rndm = new Random();
  
        // this will generate a random number between 0 and
        // HashSet.size - 1
        int rndmNumber = rndm.nextInt(st.size());
  
        // get the element at random number index
        return arrayNumbers[rndmNumber];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */