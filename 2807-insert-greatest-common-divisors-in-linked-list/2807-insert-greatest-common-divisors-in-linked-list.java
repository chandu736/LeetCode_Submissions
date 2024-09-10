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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode current=head;
        while(current!=null && current.next!=null){
            ListNode temp=current.next;
            int gcdVal=gcd(current.val,temp.val);
            ListNode gcdNode=new ListNode(gcdVal);
            current.next=gcdNode;
            gcdNode.next=temp;
            current=temp;
        }
        return head;
    }
    private static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}