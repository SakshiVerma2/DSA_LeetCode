1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        ListNode curr = head;
4        while (curr != null && curr.next != null) {
5            if (curr.val == curr.next.val) {
6                
7                curr.next = curr.next.next;
8            } else {
9                
10                curr = curr.next;
11            }
12        }
13
14        return head;
15    }
16}