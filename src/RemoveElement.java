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