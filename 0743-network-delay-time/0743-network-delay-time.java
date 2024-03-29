class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        ArrayList<int []>[]graph = new ArrayList[n+1];
        
        for(int i=0;i<=n;i++){
            graph[i] = new ArrayList<>();
        }
        
    PriorityQueue<int []> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        
    boolean []vis = new boolean[n+1];
        for(int []edge: times){
            graph[edge[0]].add(new int[]{edge[1],edge[2]});
        }
        
        int nodesCount = 0;
        pq.add(new int []{k,0});
        int time=0;
        
        while(pq.size()!=0){
        
        int []temp = pq.poll();
            
        if(vis[temp[0]])continue;
            
        vis[temp[0]]= true;
            
        nodesCount++;
            
        time = Math.max(temp[1],time);
            
        for(int [] nbr: graph[temp[0]]){
            
            if(vis[nbr[0]]!= true){
                pq.add(new int[]{nbr[0],temp[1]+nbr[1]});
                
            }
        }
    }
        
        return nodesCount == n ? time:-1;
    }
        
}
