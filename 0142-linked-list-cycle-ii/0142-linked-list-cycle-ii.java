public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if(head == null || head.next == null) {
            return null;
        }
        while(true) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == null || fast == null || fast.next == null) {
                return null;
            }
            if(slow == fast) {
                ListNode third = head;
                while(third != fast) {
                    third = third.next;
                    fast = fast.next;
                }
                return third;
            }
        }
    }
}