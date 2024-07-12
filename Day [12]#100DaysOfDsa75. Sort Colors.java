class Solution {
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public void sortColors(int[] nums) {
        int l=0,mid=0,r=nums.length-1;
        while(mid<=r){

            if(nums[mid] == 0){
                swap(nums,l++,mid++);
            }
            else if(nums[mid]==1){
                mid++;
            }
            else {
                swap(nums, mid, r--);
            }
        }
    }
}