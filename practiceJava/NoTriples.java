public class NoTriples {
    public static boolean noTriples(int[] nums) {
        int i = 0;
        boolean b = true;
        while (i < (nums.length - 2)) {
            if ((nums[i] == nums[i + 1]) && (nums[i + 1] == nums[i + 2])) {
                b = false;
            }
            i++;
        }
        return b;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int[] nums1 = {1,1,1};
        int[] nums2 = {1,1,1,2,2,2};
        System.out.println(noTriples(nums));
        System.out.println(noTriples(nums1));
        System.out.println(noTriples(nums2));

    }
}
