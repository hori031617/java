/**
 * 26.
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 * 
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array nums. More formally,
 * if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 * 
 * Return k after placing the final result in the first k slots of nums.
 * 
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 */
class RemoveDuplicates {

    public static int removeDuplicates(int[] nums){
        int i = 0;

        for(int j=0, k=1; j<nums.length-1; j++, k++){
            if(nums[j] != nums[k]){
                nums[i] = nums[k];
                i++;
            }
        }

        return i+1;
    }

    public static int voteRemoveDuplicates(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int j = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != nums[j]){
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }

    public static void main(String[] args){
        int[] nums = {1,1,2};
        // removeDuplicates(nums);
        voteRemoveDuplicates(nums);
    }
}
