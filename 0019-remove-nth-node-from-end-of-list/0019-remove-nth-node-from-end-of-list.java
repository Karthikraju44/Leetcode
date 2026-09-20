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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        if(n==length) {
            return head.next;
        }
        int i=0;
        ListNode j=head;
        while(i<length-n-1){
            j=j.next;
            i++;
        }
        j.next=j.next.next;
        return head;
    }
}