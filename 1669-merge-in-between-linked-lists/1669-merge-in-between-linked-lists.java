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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=new ListNode(0);
        temp.next=list1;
        ListNode prev=temp;
        for(int i=0;i<a;i++){
            prev=prev.next;
        }
        ListNode end=prev;
        for(int i=a;i<=b+1;i++){
            end=end.next;
        }
        prev.next=list2;
        while(list2.next!=null){
            list2=list2.next;
        }
        list2.next=end;
        return temp.next;
    }
}