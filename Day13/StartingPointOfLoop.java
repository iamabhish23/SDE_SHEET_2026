/*
Question: Find Starting Point of Loop in Linked List

Approach:
1. Detect cycle using Floyd's Algorithm.
2. Move one pointer to head.
3. Move both one step at a time.
4. Meeting point is the start of the loop.

Time: O(n)
Space: O(1)
*/

public class Solution {

    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        return null;
    }
}
