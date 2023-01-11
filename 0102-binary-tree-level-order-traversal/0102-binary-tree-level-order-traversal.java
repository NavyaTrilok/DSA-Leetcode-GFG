/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        LinkedList<TreeNode> que = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        que.addLast(root);
        
        while(que.size()>0){
            int size = que.size();
            List<Integer> comp = new ArrayList<>();
            while(size--> 0){
                TreeNode n = que.removeFirst();
                
                if(n!=null){
                       comp.add(n.val);
                
                    if(n.left!=null){
                        que.addLast(n.left);
                    }
                    if(n.right!=null){
                        que.addLast(n.right);
                    }
                }
                 
                
                
            }
            ans.add(comp);
        }
        return ans;
    }
}