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
    public ListNode partition(ListNode head, int x) {
        ListNode list1 = new ListNode(-1);
        ListNode list2 = new ListNode(-1);
        ListNode curr = head;
        ListNode list1tail = list1;
        ListNode list2tail = list2;
        
        while(curr != null){
            if(curr.val < x){
                list1tail.next = curr;
                list1tail = list1tail.next;
            }else{
                list2tail.next = curr;
                list2tail = list2tail.next;
                
            }
            curr = curr.next;
        }
        
        list1tail.next = list2.next;
        list2tail.next = null;
        
        return list1.next;
        
    }
}