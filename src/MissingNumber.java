import java.util.Arrays; 

class MissingNumber {

    public static int getMissingNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        boolean isMatch = false;

        for(int i=0; i<nums.length; i++){
            if(i != nums[i]){
                result = i;
                isMatch = true;
                break;
            }
        }

        if(!isMatch){
            result = nums.length;
        }

        return result;
    }

    public static void main(String[] args){

        int[] nums = {9,6,4,2,3,5,7,0,1};
        // int[] nums = {0,1};
        int result = getMissingNumber(nums);

        System.out.print(result);

    }
    
}
