public class Factorial {
    public static int factorial(int N) {
        int f = 1;
        if (N == 1) {
            return f;
        }
        else {
            f = N * factorial(N-1);
        }
        return f;
    }

    public static void main(String[] args){
        System.out.println(factorial(5));    
    }
}
