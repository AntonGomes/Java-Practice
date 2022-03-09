public class SaferDivider{
    public static void main(String[] args){
        double A = Double.parseDouble(args[0]);
        double B = Double.parseDouble(args[1]);
        if (B==0) {System.out.println("You cannot divide by 0!");}
        else {System.out.println(A/B);}
    }}
