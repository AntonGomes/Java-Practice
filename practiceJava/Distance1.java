public class Distance1{
    public static void main (String[] args ){
        int int1 = Integer.parseInt(args[0]);
        int int2 = Integer.parseInt(args[1]);
        System.out.println(Math.max(int1,int2) - Math.min(int1,int2));
    }
}

