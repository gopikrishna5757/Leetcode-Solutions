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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return new int[] { -1, -1 };
        ListNode temp = head;
        temp = temp.next;
        int min = Integer.MAX_VALUE;
        int count1 = -1, count2 = -1, count3 = -1, k = 2;

        while (temp.next != null) {
            if ((temp.val > head.val && temp.val > temp.next.val)
                    || (temp.val < head.val && temp.val < temp.next.val)) {
                if (count1 == -1) {
                    count1 = k;
                } else if (count2 == -1) {
                    count2 = k;
                    count3 = k;

                } else {
                    min = Math.min(min, k - count3);
                    count3 = k;
                }
            }

            k++;
            temp = temp.next;
            head = head.next;
        }
       

        if (count2 == -1 || count1 == -1)
            return new int[] { -1, -1 };
        if (count3 == -1) {
            return new int[] { count2 - count1, count2 - count1 };
        }

        return new int[] { Math.min(count2 - count1, min), count3 - count1 };
    }
}