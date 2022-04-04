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
    public int getDecimalValue(ListNode head) {
        
        /*int n=0;
        ListNode temp=head;
        
        while(temp.next!=null){
            n <<= 1;
            n=n+temp.val;
            temp=temp.next;
        }
        
        return n;*/
        
                int ans = 0;
        ListNode ptr = head;
        while (ptr != null) {
            ans <<= 1;
            ans += ptr.val;
            ptr = ptr.next;
        }
        return ans;
        
    }
}
        /*n=n+temp.val;
        
        System.out.println(n);
        
        Integer number=0;
        
        try{
            number = Integer.valueOf(n);
           // System.out.println(number); // output = 25
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }       
         
        int rem;
        int ans=0;
        int place=0;
        
        while(number!=0){
            rem=number%10;
            number=number/10;
            ans=ans+rem*(int) Math.pow(2,place);
            place++;
        }
        
        //System.out.println(ans);
        
        return ans;
        
    }
}*/