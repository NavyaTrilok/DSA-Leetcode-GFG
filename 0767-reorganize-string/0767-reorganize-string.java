class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> bucket1 = new HashMap<>();
        int maxCount = 0;
        for(char currentChar : s.toCharArray()){
            bucket1.put(currentChar,bucket1.getOrDefault(currentChar,0) + 1);
            maxCount = Math.max(maxCount, bucket1.get(currentChar));
        }
        
        if(maxCount > s.length() / 2 + 1)
            return "";
        Map<Integer, List<Character>> bucket2 = new HashMap<>();
        for(Character currentChar : bucket1.keySet()){
            int freq = bucket1.get(currentChar);
            if(!bucket2.containsKey(freq)){
                bucket2.put(freq,new ArrayList<>());
            }
            bucket2.get(freq).add(currentChar);
        }
        char[] res = new char[s.length()];
        int index = 0;
        for(int count = maxCount; count > 0; count--){
            if(!bucket2.containsKey(count))
                continue;
            List<Character> list = bucket2.get(count);
            for(Character currentChar: list){
                for(int currentCount = 0; currentCount < count; currentCount++){
                    if(index == 1 && currentChar == res[index - 1])
                        return "";
                    res[index] = currentChar;
                    index += 2;
                    if(s.length() <= index){
                        index = 1;
                    }
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(char c : res){
            sb.append(c);
        }
        return sb.toString();
    }
}