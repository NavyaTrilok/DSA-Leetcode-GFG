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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode curr = head;
        ListNode oddtail = odd;
        ListNode eventail = even;
        int count = 1;
        while(curr!=null){
            if(count % 2 != 0){
                oddtail.next = curr;
                oddtail = oddtail.next;
            }else{
                eventail.next = curr;
                eventail = eventail.next;
            }
            curr = curr.next;
            count++;
        }
        
        oddtail.next = even.next;
        eventail.next = null;
        
        return odd.next;
        
    }
}