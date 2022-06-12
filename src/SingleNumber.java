/**
 * 136.
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * 
 * https://style.potepan.com/articles/29895.html#:~:text=%E6%9A%97%E5%8F%B7%E5%8C%96%E3%81%AB%E3%81%A4%E3%81%84%E3%81%A6-,%E3%83%93%E3%83%83%E3%83%88%E6%BC%94%E7%AE%97%E5%AD%90%E3%80%8CXOR(%E6%8E%92%E4%BB%96%E7%9A%84%E8%AB%96%E7%90%86%E5%92%8C)%E3%80%8D,%E3%81%AB%E3%81%99%E3%82%8B%E6%BC%94%E7%AE%97%E5%AD%90%E3%81%A7%E3%81%99%E3%80%82&text=XOR%E6%BC%94%E7%AE%97%E5%AD%90%E3%81%AF%E3%80%8C%5E%E3%80%8D,%E3%82%88%E3%81%86%E3%81%AB%E8%A8%88%E7%AE%97%E3%81%A7%E3%81%8D%E3%81%BE%E3%81%99%E3%80%82
 */
class SingleNumber {
    
    public static int getSingleNumber(int[] nums){
        int result = 0;
        for(int i : nums) {
            result ^= i;
        }
        return result;
    }


    public static void main(String[] args){

        int[] nums = {3,9,4,1,2,1,3,2,4};
        int ret = getSingleNumber(nums);

        System.out.println(ret);
    }
}
