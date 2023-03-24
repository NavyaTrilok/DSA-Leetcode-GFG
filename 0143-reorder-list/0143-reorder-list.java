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
    public void reorderList(ListNode head) {
        ListNode mid = getMid(head);
        ListNode next = mid.next;
        mid.next = null;
        ListNode secList = reverseList(next);
        merge(head,secList);
    }
    
    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next; 
        }
        return slow;
    }
    
    public ListNode reverseList(ListNode node){
        ListNode prev = null;
        ListNode curr = node;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }
        
        return prev;
    }
  
    
    public void merge(ListNode head, ListNode head2){
        ListNode curr1 = head;
        ListNode curr2 = head2;
        
        while(curr2 != null){
            ListNode next1 = curr1.next;
            ListNode next2 = curr2.next;
            
            curr1.next = curr2;
            curr2.next = next1;
            
            curr1 = next1;
            curr2 = next2;
        }
        
        
    }
}