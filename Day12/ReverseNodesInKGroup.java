/*
Question: Reverse Linked List in Groups of Size K

Approach:
First check if K nodes are available.
If yes, reverse those K nodes.
Then recursively reverse the remaining list and connect it.

Time: O(n)
Space: O(n/k) recursion stack
*/

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;

        for (int i = 0; i < k; i++) {
            if (temp == null) {
                return head;
            }
            temp = temp.next;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        for (int i = 0; i < k; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head.next = reverseKGroup(curr, k);

        return prev;
    }
}
