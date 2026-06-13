/*
Question: Find Intersection Point of Y Linked List

Approach:
Use two pointers.
Move pointer A on list A and pointer B on list B.
When any pointer reaches null, redirect it to the other list head.
If intersection exists, both pointers meet at intersection node.

Time: O(n + m)
Space: O(1)
*/

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {

            if (a == null) {
                a = headB;
            } else {
                a = a.next;
            }

            if (b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }

        return a;
    }
}
