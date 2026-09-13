public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int m=findLength(headA);
        int n=findLength(headB);
        if(m>n) {
            int diff = m - n;
            while(diff>0){
                headA=headA.next;
                diff--;
            }
        }
        else {
            int diff=n-m;
            while(diff>0) {
                headB=headB.next;
                diff--;
            }
        }
        while(headA!=headB) {
            headA=headA.next;
            headB=headB.next;
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