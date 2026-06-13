/*
Question: Rotate a Linked List

Approach:
Find length of list.
Connect tail to head to make it circular.
Break the circle at the correct position.

Time: O(n)
Space: O(1)
*/

class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode temp = head;
        int length = 1;

        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        temp.next = head;

        k = k % length;
        int stepsToNewTail = length - k;

        ListNode newTail = head;

        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
