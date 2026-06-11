/*
Question: Delete Node in a Linked List O(1)

Approach:
Copy next node's value into current node.
Then delete the next node.

Time: O(1)
Space: O(1)
*/

class Solution {
    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;
    }
}
