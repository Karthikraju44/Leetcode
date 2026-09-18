class Solution {

    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null) {
            return true;
        }
        int length = findLength(head);
        int reversePoint = (length + 1) / 2;
        ListNode reversePointNode = findKthNode(head, reversePoint);
        ListNode head2 = reverse(reversePointNode);
        ListNode first = head;
        ListNode second = head2;
        while(second != null && first != null) {
            if(first.val != second.val) {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }


    // Find length of linked list
    private int findLength(ListNode head) {

        ListNode current = head;
        int length = 0;

        while(current != null) {
            current = current.next;
            length++;
        }

        return length;
    }


    // Find kth node (0-based)
    private ListNode findKthNode(ListNode head, int k) {

        ListNode current = head;

        for(int cnt = 0; cnt < k; cnt++) {
            current = current.next;
        }

        return current;
    }


    // Reverse linked list from given node
    private ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while(current != null) {

            ListNode next = current.next;

            current.next = prev;

            prev = current;
            current = next;
        }

        return prev;
    }
}