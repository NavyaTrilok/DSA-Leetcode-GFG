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
    public ListNode reverseList(ListNode head) {
        
        
        int size = getSize(head);
        int i = 0;
        int j = size;
        
        if(size == 0){
            return null;
        }else if(size == 1){
            return head;
        }else if(head.next.next==null){
            ListNode temp = head;
            int a = head.val;
            temp.val = head.next.val;
            head.next.val = a;
            return head;
        }else{
                while(i<j){
                ListNode nai = getAt(i,head);
                ListNode naj = getAt(j,head);

                int temp = nai.val;
                nai.val = naj.val;
                naj.val = temp;

                i++;
                j--;
            }
        }

        return head;
    }
    
    public int getSize(ListNode head){
        if(head == null){
            return 0;
        }else if(head.next == null){
            return 1;
        }else if(head.next.next == null){
            return 2;
        }else{
                ListNode itr=head;
                int size=0;
                while(itr.next!=null){
                    itr = itr.next;
                    size++;
                }
            return size;
        }
       
    }
    public ListNode getAt(int idx,ListNode head){
        ListNode temp=head;
        for(int i = 0; i< idx ;i++){
            temp = temp.next;
        }
        return temp;
    }
}