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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        dummy.val = -1;
        ListNode ai = dummy;
        ListNode ui = list1;
        ListNode li = list2;
        ListNode ans = new ListNode();
        while(ui!=null && li!=null){
            if(ui.val<li.val){
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
            
          
        ans = dummy.next;
        return ans;
    }
}