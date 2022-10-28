class Solution {
    public String[] findRelativeRanks(int[] score) {
         PriorityQueue<Integer>pq = new PriorityQueue<>((x,y)->score[y]-score[x]);
        for (int i=0;i<score.length;i++) pq.add(i);
        String []res = new String[score.length];
        if (!pq.isEmpty())res[pq.poll()]="Gold Medal";
        if (!pq.isEmpty())res[pq.poll()]="Silver Medal";
        if (!pq.isEmpty())res[pq.poll()]="Bronze Medal";
        int place = 4;
        while(!pq.isEmpty()){
            res[pq.poll()]=String.valueOf(place);
            place++;
        }
        return res;
        
    }
}