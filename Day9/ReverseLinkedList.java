/*
Question: Reverse a Linked List

Given the head of a singly linked list,
reverse the list and return the new head.

Approach:
Use three pointers:
prev, curr, next

Reverse the links one by one.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }
}
