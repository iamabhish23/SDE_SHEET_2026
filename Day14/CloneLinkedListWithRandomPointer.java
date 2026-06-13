/*
Question: Clone a Linked List with Random and Next Pointer

Approach:
1. Insert copied nodes between original nodes.
2. Set random pointers for copied nodes.
3. Separate original and copied list.

Time: O(n)
Space: O(1)
*/

class Solution {
    public Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        Node curr = head;

        while (curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        curr = head;

        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        curr = head;
        Node dummy = new Node(0);
        Node copyTail = dummy;

        while (curr != null) {
            Node copy = curr.next;
            curr.next = copy.next;
            copyTail.next = copy;
            copyTail = copy;
            curr = curr.next;
        }

        return dummy.next;
    }
}
