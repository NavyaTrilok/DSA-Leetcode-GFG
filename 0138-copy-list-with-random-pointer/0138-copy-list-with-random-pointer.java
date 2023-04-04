/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        //base case
        if(head == null)
            return null;
        //define table
        HashMap<Node,Node> hm = new HashMap<>();
        //define curr pointer = head
        Node curr = head;
        hm.put(curr,new Node(curr.val));
        
        //while curr pointer!=null
        while(curr!=null){
            //1.Get the new node of the curr pointer
            Node curClone = hm.get(curr);
            
            //2.Build the random pointer if doesn't exists in the table
            if(curr.random!=null && !hm.containsKey(curr.random)){
                hm.put(curr.random, new Node(curr.random.val));
            } 
            Node randomClone = hm.get(curr.random);
            
            //3.Get new cur node point to new random node
            curClone.random = randomClone;
            
            //4.build the next node if doesn't exisits in the table
            if(curr.next != null && !hm.containsKey(curr.next)){
                hm.put(curr.next,new Node(curr.next.val));
            }
            Node nexClone = hm.get(curr.next);
            //5. Get the new curNode point to the next new node
            curClone.next = nexClone;
            
            //6.cur pointer move the next node
            curr = curr.next;
            
        }
        
        //return the new head node from the table
        return hm.get(head);
    }
}