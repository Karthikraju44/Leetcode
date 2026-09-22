class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }
        // Step 1: Find the middle of the list
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Step 2: Split the list into two halves
        ListNode secondHalf = slow.next;
        slow.next = null;
        // Step 3: Reverse the second half
        secondHalf = reverseList(secondHalf);
        // Step 4: Merge the two halves
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
    // Reverse a linked list
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