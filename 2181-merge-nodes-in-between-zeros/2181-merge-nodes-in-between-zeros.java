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
    public ListNode mergeNodes(ListNode head) {
        ListNode p1=head;
        ListNode p2=head.next;
        int sum=0;
        while(p2!=null){
            if(p2.val!=0){
                sum+=p2.val;
            }
            else if(p2.next==null){
                p1.val=sum;
                p1.next=null;

            }
            else {
                p1.val=sum;
                p1.next=p2;
                p1=p2;
                sum=0;
            }
            
            p2=p2.next;
        }
        
   return head; }
}