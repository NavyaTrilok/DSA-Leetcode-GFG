class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char curChar : s.toCharArray()){
            map.put(curChar,map.getOrDefault(curChar,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        Queue<Character> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        
        maxHeap.addAll(map.keySet());
        
        while(maxHeap.size() > 1){
            Character firstChar = maxHeap.poll();
            sb.append(firstChar);
            map.put(firstChar,map.get(firstChar) - 1);
            Character secondChar = maxHeap.poll();
            sb.append(secondChar);
            map.put(secondChar,map.get(secondChar) - 1);
            
            if(map.get(firstChar)>0){
                maxHeap.add(firstChar);
            }
            if(map.get(secondChar)>0){
                maxHeap.add(secondChar);
            }
        }
        
        if(!maxHeap.isEmpty()){
            if(map.get(maxHeap.peek())>1){
                return "";
            }else{
                sb.append(maxHeap.peek());
            }
        }
        
        return sb.toString();
    }
}