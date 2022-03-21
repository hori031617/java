/**
 * 1480.
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 * 
 * Example
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */

class RunningSumArray {

    public static int[] runningSum(int[] nums){
        int[] result = new int[nums.length];
        
        result[0] += nums[0];
        for(int i=1; i<nums.length; i++){
            result[i] = result[i-1] + nums[i];
        }

        return result;
    }

    public static int[] runningSum2(int[] nums){
        // modify the input array, adding n[i] with n[i-1]
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }      
        
        // return the modified array
        return nums;
    }

    public static void main(String[] args){
        // int[] nums = {1,2,3,4};
        // int[] nums = {1,1,1,1,1};
        int[] nums = {3,1,2,10,1};
        int[] result = runningSum(nums);

        for(int r : result){
            System.out.println(r);
        }
    }
    
}
