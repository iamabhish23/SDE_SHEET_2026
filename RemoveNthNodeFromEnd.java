/*
Question: Remove Nth Node From End of List

Given the head of a linked list,
remove the nth node from the end and return its head.

Approach:
Use Fast and Slow Pointer.

Move fast pointer n steps ahead.
Then move both pointers together.

When fast reaches end,
slow will be just before the node to delete.

Time Complexity: O(n)
Space Complexity: O(1)
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
