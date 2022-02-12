class MergeArray{

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int nums1Len = m-1;
        int nums2Len = n-1;
        int totalLen = m+n-1;

        while(nums1Len>=0 && nums2Len>=0){
            nums1[totalLen--] = nums1[nums1Len] > nums2[nums2Len] 
                              ? nums1[nums1Len--] : nums2[nums2Len--];
        }

        while(nums2Len >= 0){
            nums1[totalLen--] = nums2[nums2Len--];
        }
    }


    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        merge(nums1, m, nums2, n);

        for(int i=0; i<nums1.length; i++){
            System.out.println(nums1[i]);
        }

    }
}