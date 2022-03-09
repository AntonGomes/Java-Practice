public class has271 {
    public static boolean has271(int[] nums) {
        int i = 0;
        while (i<(nums.length - 2)) {
            if ((nums[i] == (nums[i + 1] - 5)) && (nums[i] == (nums[i + 2] + 1))) {
                        return true;
            }
        i++;
        }
        return false;
    }
    
    public static void main(String[] args){
        int[] nums1 = {1,2,7,1};
        int[] nums2 = {1,2,8,1};
        int[] nums3 = {2,7,1};
        int[] nums4 = {4,9,3};
       System.out.println(has271(nums1));
       System.out.println(has271(nums2));
       System.out.println(has271(nums3));
       System.out.println(has271(nums4));
    }
}
