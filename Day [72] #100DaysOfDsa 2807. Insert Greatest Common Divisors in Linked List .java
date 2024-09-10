class Solution {
    public int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);    
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null) return head;

        ListNode dumy = new ListNode(0,head);
        ListNode curr = head, pp=dumy;
        while(curr != null){
            
            int gcdVal = gcd(pp.val,curr.val);
            ListNode gcdNode = new ListNode( gcdVal, curr);
            pp.next = gcdNode;
            pp = curr;
            curr = curr.next;
        }

        return dumy.next.next;
    }
}