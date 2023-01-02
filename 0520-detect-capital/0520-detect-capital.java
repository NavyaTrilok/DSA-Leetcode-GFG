class Solution {
    public boolean detectCapitalUse(String word) {
        
        int count = 0;
        
        boolean firstletter = false;
        
        if(word.charAt(0)>='A' && word.charAt(0)<='Z') 
            firstletter = true;
        
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                count++;
            }
        }
        
        if((count==1 && firstletter==true) || count==0 || count == word.length()){
            return true;
        }
        
        return false;
    }
}