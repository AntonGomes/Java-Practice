public class ArrayFront9 {
    public static boolean arrayFront9(int[] nums) {
        assert (nums.length<=5) : "array length must be less than 4";
        boolean niner = false;
        for (int i = 0; i < 4; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return niner;
    }
    public static void main(String[] args){
       int n = args.length;
       int[] nums = new int[n];
       for (int i = 0; i < n; i++) {
           nums[i] = Integer.parseInt(args[i]);
       }
       System.out.println(arrayFront9(nums));
    }
}
