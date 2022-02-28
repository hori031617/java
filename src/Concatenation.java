class Concatenation {
    
    public static int[] getConcatenation(int[] nums){
        int len = nums.length;
        int[] result = new int[len*2];

        for(int i=0; i<len; i++){
            result[i] = result[i+len] = nums[i];
        }

        return result;
    }

    public static void main(String[] args){
        int[] nums = {1,3,2,1};
        int[] result = getConcatenation(nums);
        for(int r : result){
            System.out.println(r);
        }
    }
}
