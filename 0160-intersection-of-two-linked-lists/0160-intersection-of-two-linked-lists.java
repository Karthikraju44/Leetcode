public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int m = findLength(headA);
        int n = findLength(headB);

        // Move the longer list forward
        if(m > n) {
            int diff = m - n;

            while(diff > 0) {
                headA = headA.next;
                diff--;
            }
        }
        else {
            int diff = n - m;

            while(diff > 0) {
                headB = headB.next;
                diff--;
            }
        }

        // Now both lists have the same remaining length
        while(headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }

    private int findLength(ListNode head) {
        ListNode current = head;
        int length = 0;

        while(current != null) {
            length++;
            current = current.next;
        }

        return length;
    }
}