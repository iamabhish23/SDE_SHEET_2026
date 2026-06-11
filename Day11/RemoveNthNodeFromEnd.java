/*
Question: Remove Nth Node From End of Linked List

Approach:
Use fast and slow pointers.
Move fast n steps ahead, then move both together.
When fast reaches the end, slow is before the node to delete.

Time: O(n)
Space: O(1)
*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
