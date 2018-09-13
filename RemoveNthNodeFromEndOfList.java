/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // vars for tracking the node before node to be removed and one to find the end of the list
        ListNode beforeTarget = head;
        ListNode end = head;
        ListNode target = head;
        
        // make sure that the linked list is not shorter than n
        for (int i = 0; i < n - 1; i++) {
            if (end.next != null) {
                end = end.next;
            }
        }
        if (end.next == null) return head.next;
        target = target.next;
        end = end.next;
        
        // update pointers to node before target and the end of the linked list
        while (end.next != null) {
            beforeTarget = beforeTarget.next;
            target = target.next;
            end = end.next;
        }
        
        // extract the target and repair the linked list
            beforeTarget.next = target.next;
            return head;
        
        
        
    }
}