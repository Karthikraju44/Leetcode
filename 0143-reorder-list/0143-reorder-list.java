class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = slow.next;
        slow.next = null;
        secondHalf = reverseList(secondHalf);
        ListNode current = head;
        while(secondHalf != null) {
            ListNode nextFirst = current.next;
            ListNode nextSecond = secondHalf.next;
            current.next = secondHalf;
            secondHalf.next = nextFirst;
            current = nextFirst;
            secondHalf = nextSecond;
        }
    }
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while(current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}