class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = head;
        ListNode prev = dummy;

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                int dup = curr.val;

                
                while (curr != null && curr.val == dup) {
                    curr = curr.next;
                }
                prev.next = curr;   
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
