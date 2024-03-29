/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return null;
        if(head.next.next == null) return null;
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
                break;
        }
        
        if(slow!=fast)
            return null;
        
        slow = head;
            
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}