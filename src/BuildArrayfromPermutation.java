/**
 * 1920.
 * Given a zero-based permutation nums (0-indexed), build an array ans of the same length
 * where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
 * 
 * A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 */
class BuildArrayfromPermutation {

    public static int[] buildArray(int[] nums){
        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static int[] buildArrayDiscuss(int[] nums) {
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            // this is done to keep both old and new value together. 
            // going by the example of [5,0,1,2,3,4]
            // after this nums[0] will be 5 + 6*(4%6) = 5 + 24 = 29;
            // now for next index calulation we might need the original value of num[0] which can be obtain by num[0]%6 = 29%6 = 5;
            // if we want to get just he new value of num[0], we can get it by num[0]/6 = 29/6 = 4
            nums[i] = nums[i] + n*(nums[nums[i]] % n);
        }
        
        for(int i=0; i<n; i++){
            nums[i] = nums[i]/n;
        }
        
        return nums;
    }
    

    public static void main(String[] args){

        // int[] nums = {0,2,1,5,3,4};
        int[] nums = {5,0,1,2,3,4};
        int[] ans = buildArrayDiscuss(nums);

        for(int a : ans){
            System.out.println(a);
        }
    }
}
