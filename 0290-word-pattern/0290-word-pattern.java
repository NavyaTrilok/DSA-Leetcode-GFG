class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        Map index = new HashMap();
        String[] words = s.split(" ");
        if(words.length != pattern.length())
            return false;
        
        for(Integer i=0; i<words.length ; ++i)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;
        
        return true;
        
    }
}