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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode r=new ListNode(-1);
        ListNode k=r;
        PriorityQueue<ListNode> pq= new PriorityQueue<>((a,b)->{
           return Integer.compare(a.val,b.val);
        });
        for(ListNode l:lists){
            if(l!=null) pq.offer(l); 
            
        }
        while(!pq.isEmpty()){
            ListNode temp=pq.poll();
            k.next=temp;
            k=k.next;

            temp=temp.next;
            if(temp!=null) pq.offer(temp);
        }
        
   return r.next; }
}