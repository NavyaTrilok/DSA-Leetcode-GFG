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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode prev = null;
        int k = 0, count =1;
        while(temp != null){
            k++;
            temp = temp.next;
        }
        temp = head;
        while(count < k-n+1){
          prev = temp;
          temp = temp.next;
          count++;
        }
        
          if(prev == null){
                head = head.next;
                return head;
            }else{
                prev.next = prev.next.next;
                return head;
            }
        
    }
}