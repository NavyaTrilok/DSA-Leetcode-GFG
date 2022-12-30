class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<List<Integer>> res = new LinkedList<>();
        
        List<Integer> curr = new ArrayList<>();
        
        curr.add(0);
        
        dfs(0,graph,graph.length - 1, curr,res);
        
        return res;
        
    }
    
    public void dfs(int src, int[][] graph,int dest, List<Integer> curr, List<List<Integer>> res){
        if(src == dest){
            res.add(new ArrayList(curr));
            return;
        }
        
        for(int nbr : graph[src]){
            curr.add(nbr);
            dfs(nbr,graph,dest,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}