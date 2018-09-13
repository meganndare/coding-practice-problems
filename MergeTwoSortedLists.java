/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(0);
        ListNode solution = newHead;
        // Question - can I just set things or do i need to construct a new node for every thing i am setting in my soln linkedlist
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        if (l1.val > l2.val) {
            newHead.next = l2;
            l2 = l2.next;
        } else if (l2.val >= l1.val) {
            newHead.next = l1;
            l1 = l1.next;
        }
        
        //this doesn't address when the new l1 we just set is null.. probably will cause a bug
        
        while (l1.next != null && l2.next != null) {
            if (l1.val > l2.val) {
            newHead = newHead.next;
            newHead.next = l2;
            l2 = l2.next;
        } else if (l2.val >= l1.val) {
            newHead = newHead.next;
            newHead.next = l1;
            l1 = l1.next;
        }
        }
        
        if (l1.next == null) {
            while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                newHead = newHead.next;
                newHead.next = l2;
                l2 = l2.next;
            } else if (l2.val >= l1.val) {
                newHead = newHead.next;
                newHead.next = l1;
                l1 = l1.next;
            } 
            }
            if (l2 != null) {
            newHead = newHead.next;
            newHead.next = l2;
            }
            
        }
        
        if (l2.next == null) {
            while (l2 != null && l1 != null) {
            if (l1.val > l2.val) {
                newHead = newHead.next;
                newHead.next = l2;
                l2 = l2.next;
            } else if (l2.val >= l1.val) {
                newHead = newHead.next;
                newHead.next = l1;
                l1 = l1.next;
            }
            }
            if (l1 != null) {
            newHead = newHead.next;
            newHead.next = l1;
            }
        }
        
        
        return solution.next;

    }
}