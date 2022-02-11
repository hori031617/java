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
