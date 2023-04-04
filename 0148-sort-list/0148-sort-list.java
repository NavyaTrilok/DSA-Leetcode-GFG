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
    public ListNode sortList(ListNode head) {
        //ListNode mid = null;
        if(head == null || head.next == null)
            return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //ListNode mid = slow.next;
        prev.next = null;
        
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        
        return merge(l1,l2);
    }
    
    public ListNode merge(ListNode ui,ListNode li){
        //ListNode ui = head;
        //ListNode li = head;
        ListNode dummy = new ListNode(0);
        dummy.next = null;
        ListNode ai = dummy;
        while(li != null && ui != null){
            if(ui.val < li.val){
                ai.next = ui;
                ui = ui.next;
            }else{
                ai.next = li;
                li = li.next;
            }
            ai = ai.next;
        }
        
        if(ui!=null){
            ai.next = ui;
        }else{
            ai.next = li;
        }
        
        return dummy.next;
        
    }
}