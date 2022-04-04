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
    public ListNode swapNodes(ListNode head, int k) {
        
        int count1=0;
        int count2=0;
        int len_count=0;
        ListNode temp1=head;
        ListNode temp2=head;
        ListNode length=head;
        int temp=0;
       // temp.val=10;
        //temp.next=null;
        
        
        while(length.next!=null){
            length=length.next;
            len_count++;
            
            if(len_count==k-1)
                temp1=length;
             
        }
        
        while(count2!=len_count-(k-1)){
            temp2=temp2.next;
            count2++;
        }
        
        temp=temp1.val;
        temp1.val=temp2.val;
        temp2.val=temp;
        
        return head;
    }
}