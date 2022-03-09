import java.util.Scanner;

public class NMax {
    public static double max(double a, double b, double c) {
        double m = a;
            if (b>a && b>c) {
                m = b;
            }
            else if (c>a && c>b) {
                m = c;
            }
            return m;
    }

    public static int max (int a, int b, int c) {
        int m = a;
        if (b>a && b>c) {
                m = b;
            }
        else if (c>a && c>b) {
                m = c;
            }
        return m;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println(max(stdIn.nextInt(), stdIn.nextInt(), stdIn.nextInt()));
        System.out.println(max(stdIn.nextDouble(), stdIn.nextDouble(), stdIn.nextDouble()));

    }
}
