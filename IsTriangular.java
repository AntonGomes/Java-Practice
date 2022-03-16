import java.util.Scanner;

public class IsTriangular {
    public static boolean isTri(double a, double b, double c) {
        boolean tri = true;
        if ((a>=(b+c))||(b>=(a+c))||(c>=(a+b))) {
            tri = false;
        }
        return tri;
    }    
    public static void main(String[] args){
       Scanner stdIn = new Scanner(System.in);
       double a = stdIn.nextDouble();
       double b = stdIn.nextDouble();
       double c = stdIn.nextDouble();

       if (isTri(a,b,c)) {
           System.out.printf("%s, %s and %s could be the lengths of a triangle\n", a,b,c);
       }
       else {
           System.out.println("Not a triangle.");
       }

           stdIn.close();
}
}
