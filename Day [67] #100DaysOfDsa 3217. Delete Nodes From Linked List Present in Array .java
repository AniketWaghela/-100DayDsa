class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();

        for(int i: nums){
            set.add(i);
        }

        ListNode dumy = new ListNode();
        dumy.next = head;
        ListNode curr = dumy, pp =dumy;

        while(curr != null){

            if(set.contains(curr.val)){
                pp.next = curr.next;
                head = head.next;
            }
            else{
                pp = curr;
            }
            curr = curr.next;
        }

        return dumy.next;
    }
}