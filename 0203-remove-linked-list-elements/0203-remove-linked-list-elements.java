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

/*When the input node is an empty node, then there is nothing to delete, so we just return a null node back. (That's the first line)

When the head of the input node is the target we want to delete, we just return head.next instead of head to skip it. (That's the third line), else we will return head.

We apply the same thing to every other node until it reaches null. (That's the second line).*/
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        head.next = removeElements(head.next,val);
        return head.val == val? head.next : head;
    }
}