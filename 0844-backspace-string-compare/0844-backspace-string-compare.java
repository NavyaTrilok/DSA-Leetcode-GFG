class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        if(s=="" && t=="") return true;
        if(s=="" || t=="") return false;
        
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        
        for(int i = 0; i< s.length(); i++){
            if(st1.size()!=0 && s.charAt(i) == '#'){
                st1.pop();
            }else if(st1.size()==0 && s.charAt(i)=='#') {
                continue;
                }
            else{
                st1.push(s.charAt(i));
            }
        }
        
         for(int i = 0; i< t.length(); i++){
            if(st2.size()!=0 && t.charAt(i) == '#'){
                st2.pop();
            }else if(st2.size()==0 && t.charAt(i) == '#'){
                continue;
            }else{
                st2.push(t.charAt(i));
            }
        }
        
        while(st1.size()!=0 && st2.size()!=0){
            if(st1.pop() != st2.pop())
                return false;
        }
        
        if(st1.size()==0 && st2.size()==0 )
            return true;
        else
            return false;
    }
}