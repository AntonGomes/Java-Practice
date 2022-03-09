import java.util.Arrays;

public class Mode {
    public static void main(String[] args){
        int[] dataset = new int[args.length];
        int[] count = {0,0,0,0,0,0,0,0,0,0};
        
        for (int i = 0; i < args.length;i++) {
            dataset[i] = Integer.parseInt(args[i]);
            }

        for (int j = 0; j < 10;j++) {
            for ( int i = 0; i < dataset.length; i++) {
                if (dataset[i] == j) {
                    count[j]++;
                }
            }
            String dots = "";
            for (int k = 0; k < count[j]; k++) {
                dots = (dots + ".");
                }
            System.out.println("[" + j + "s: " + count[j] + "]" + dots);
        }
     
        for (int i = 0; i < 10; i++) {
         if (count[i] == Arrays.stream(count).max().getAsInt()) {
            System.out.println("Mode: " + i);
            break;
            }
        }
    }
}
