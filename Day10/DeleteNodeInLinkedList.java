/*
Question: Delete Node in a Linked List

You are given a node to delete.
You do not have access to the head.

Approach:
Copy the next node's value into current node.
Delete the next node instead.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class Solution {
    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;
    }
}
