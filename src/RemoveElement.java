/**
 * 27.
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
 * 
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 * 
 * Return k after placing the final result in the first k slots of nums.
 * 
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 */
class RemoveElement{

    public static int removeElement(int[] nums, int val){
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }

    // public static int removeElement2(int[] nums, int val){
    //     int i = 0;
    //     int n = nums.length;
    //     while (i < n) {
    //         if (nums[i] == val) {
    //             nums[i] = nums[n - 1];
    //             // reduce array size by one
    //             n--;
    //         } else {
    //             i++;
    //         }
    //     }
    //     return n;
    // }



    public static void main(String[] args){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        removeElement(nums, val);
        // System.out.println(removeElement(nums, val));
        // System.out.println(removeElement2(nums, val));
    }
}