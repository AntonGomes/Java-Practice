public class ArrayRotate {
        public static void main(String[] args){
            int[] nums = {0,0,0,0,0};
            for (int i = 0; i<nums.length; i++) {
                nums[i] = Integer.parseInt(args[i]);
            }
            int[] copy = {0,0,0,0,0};
            for (int i = 0; i < (nums.length-1); i++) {
                copy[i] = nums[i+1];
            }
            copy[4] = nums[0];

            for (int j = 0; j<5; j++) {
                System.out.print(copy[j] + " ");
                }
            System.out.print("\n");
    }
}
