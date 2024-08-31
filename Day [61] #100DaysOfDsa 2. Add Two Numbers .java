class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dumy = new ListNode(0);
        ListNode curr = dumy;
        int carry = 0;

        while( l1!=null || l2!=null || carry!=0){
            
            int l1_val = l1 != null ? l1.val : 0;
            int l2_val = l2 != null ? l2.val : 0;

            int sum = l1_val+ l2_val+carry;
            int digit = sum % 10;
            carry = sum/10;

            ListNode newNode = new ListNode(digit);
            curr.next = newNode;
            curr = curr.next;

            l1 = (l1!=null) ? l1.next : null;
            l2 = (l2!=null) ? l2.next : null;
        }

        ListNode res = dumy.next;


        return res;
    }
}