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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumNodeList = new ListNode(0);
        ListNode current = sumNodeList;
        int carry = 0;
        


        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;
             if(l1 != null){
                sum += l1.val; 
                System.out.println(l1.val);
                l1 = l1.next;
             }

             if(l2 != null){
                sum += l2.val;
                System.out.println(l2.val);
                l2 = l2.next;
             }
             
             carry = sum/10;
             sum = sum%10;
             
             current.next = new ListNode(sum);
             current = current.next;
            
             System.out.println("Carry" + carry + "- Sum" + sum);
             
        }



        return sumNodeList.next;
    }
}
