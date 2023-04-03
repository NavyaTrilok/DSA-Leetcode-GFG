/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode newHead = head;
        while(newHead != null){
            if(newHead.next != null){
                int temp = newHead.val;
                newHead.val = newHead.next.val;
                newHead.next.val = temp;
            }
            
            newHead = newHead.next;
            if(newHead != null)
                newHead = newHead.next;
        }
        
        return head;
    }
}