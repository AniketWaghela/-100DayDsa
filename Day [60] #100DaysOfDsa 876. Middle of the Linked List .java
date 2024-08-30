class Solution {
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode current = head;
        while(current!=null){
            count++;
            current = current.next;
        }
        System.out.println(count);
        current = head;
        count /=2;
        while(count!=0){
            current = current.next;
            count--;
        }
        return current;
    }
}