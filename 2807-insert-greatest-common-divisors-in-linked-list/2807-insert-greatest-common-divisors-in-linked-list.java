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
        if(head==null||head.next==null) return head;
        ListNode ans = head;
        
        
        while(head.next!=null){
            //System.out.println(p1.val);
            ListNode cur=new ListNode(gcd(head.val,head.next.val));
            cur.next=head.next;
            head.next=cur;
            head=head.next.next;
        }

        
   return ans; }
}