/*
Question: Find Middle of Linked List

Given the head of a linked list,
return the middle node.

Approach:
Use Fast and Slow Pointer.

Slow moves 1 step.
Fast moves 2 steps.

When fast reaches end,
slow reaches middle.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
