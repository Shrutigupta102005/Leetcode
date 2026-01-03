/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode idx = head ;
        ArrayList<Integer> arr = new ArrayList<>();
        while(idx != null ){
                arr.add(idx.val);
                idx = idx.next ;
        }
        for(int i = 0 ;i<arr.size();i++){
            if(arr.get(i) != arr.get(arr.size() -1-i)){
                return false;
            }
        }
        return true;
    }
}