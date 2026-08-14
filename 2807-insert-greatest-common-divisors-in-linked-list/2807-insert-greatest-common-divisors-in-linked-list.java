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
    static int gcd(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;

    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null) return head;
        ListNode p1=head;
        ListNode p2=head.next;
        while(p2!=null){
            System.out.println(p1.val);
            p1.next=(new ListNode(gcd(Math.max(p1.val,p2.val),Math.min(p1.val,p2.val))));
            p1.next.next=p2;
            p1=p1.next.next;
            p2=p2.next;
        }

        
   return head; }
}