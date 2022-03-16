public class Sieve {
    public static void main(String[] args){
        int p = 2;
        int[] arr = new int[18];
        for (int i=0;i<18;i++){
            arr[i] = i+2;
        }
        
        while (p<20) {
            for (int i=p; i<18; i++) {
                if (arr[i]%p == 0 && arr[i] != p) {
                arr[i] = 0;
                }
            }
            System.out.println(p);
            boolean finished = true;
            for (int j = p-2; j<18; j++) {
                if (arr[j]>p) {
                    p = arr[j];
                    finished = false;
                    break;
                }
            }
            if (finished == true) {
                p = 21;
            }
        }
    }
}
