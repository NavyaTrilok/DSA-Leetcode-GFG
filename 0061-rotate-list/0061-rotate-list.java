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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        if(head.next == null) return head;
        if(head.next.next == null){
            
            if(k%2==0)  return head;
            else {
                System.out.println("here");
                ListNode ptr = head.next;
                head.next = null;
                ptr.next = head;
                return ptr;
            }
            
        }
        
         ListNode curr = head;
                int length = 1;

                while(curr.next!=null){
                    curr = curr.next;
                    length++;
                }
        
        if(k == 0 || k%length == 0){
             return head;
        }else{
              

                System.out.println(length);
                System.out.println(curr.val);
                k = k%length;
                ListNode tail = curr;
                ListNode temp = head;
                for(int i = 1; i< length-k ; i++){
                    temp = temp.next;
                }
                System.out.println(temp.val);
                ListNode head2 = temp.next;
                temp.next = null;
                tail.next = head;

                return head2;
        }
        
        
    }
}