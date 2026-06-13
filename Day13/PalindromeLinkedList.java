/*
Question: Check if Linked List is Palindrome

Approach:
1. Find middle using slow-fast pointer.
2. Reverse second half.
3. Compare both halves.

Time: O(n)
Space: O(1)
*/

class Solution {
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = reverse(slow.next);

        ListNode first = head;

        while (second != null) {

            if (first.val != second.val) {
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {

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
